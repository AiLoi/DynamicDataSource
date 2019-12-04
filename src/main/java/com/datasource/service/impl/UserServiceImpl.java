package com.datasource.service.impl;

import com.datasource.config.datasource.DataSource;
import com.datasource.mapper.UserMapper;
import com.datasource.module.User;
import com.datasource.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wsail
 * @Date 2019/12/4 10:18
 **/
@Service
@DataSource(dataSource = "dataSource1")
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserInfo(Integer userId) {
        return userMapper.selectUserInfo(userId);
    }
}
