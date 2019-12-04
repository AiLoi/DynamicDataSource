package com.datasource.controller;

import com.datasource.module.User;
import com.datasource.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wsail
 * @Date 2019/12/4 10:19
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("/get/user_info")
    public User showUserInfo(Integer userId){
        return userService.findUserInfo(userId);
    }

}
