package com.datasource.service;

import com.datasource.module.User;

/**
 * @ClassName IUserService
 * @Description TODO
 * @Author wsail
 * @Date 2019/12/4 10:17
 **/
public interface IUserService {

    /**
     * @Author myk
     * @Description //获取用户信息
     * @Date 10:17 2019/12/4
     * @Param [userId]
     * @return com.datasource.module.User
     **/
    User findUserInfo(Integer userId);

}
