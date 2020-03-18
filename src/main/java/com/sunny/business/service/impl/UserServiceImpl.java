package com.sunny.business.service.impl;

import com.sunny.business.common.Result;
import com.sunny.business.common.ResultUtil;
import com.sunny.business.pojo.User;
import com.sunny.business.repository.dao.UserMapper;
import com.sunny.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result<User> createUser(User user) {
        int insert = 0;
        try {
            insert = userMapper.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exception(e);
        }
        if(insert >0){
            return ResultUtil.success(user);
        }
        return ResultUtil.error("创建失败");
    }


    @Override
    public Result<List<User>> selectAllUser() {
        List<User> users = userMapper.selectAll();
        return ResultUtil.success(users);
    }
}
