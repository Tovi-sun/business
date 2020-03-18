package com.sunny.business.repository.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName
 * @Description 此接口为所有我们所以将定义mapper的基类，继承此接口即可获得单表操作的所有方法
 * @Date 2019/7/16 16:15
 * @Created by sunyiwei
 */
public interface MyBaseDao<T> extends Mapper<T>,MySqlMapper<T> {
}
