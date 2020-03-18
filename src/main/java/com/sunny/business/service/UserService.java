package com.sunny.business.service;

import com.sunny.business.common.Result;
import com.sunny.business.pojo.User;

import java.util.List;

public interface UserService {
    Result<User> createUser(User user);

    Result<List<User>> selectAllUser();
}
