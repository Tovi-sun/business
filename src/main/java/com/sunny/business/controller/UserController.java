package com.sunny.business.controller;

import com.sunny.business.common.Result;
import com.sunny.business.pojo.User;
import com.sunny.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public Result createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "/users")
    public Result queryUsers(){
        return userService.selectAllUser();
    }
}
