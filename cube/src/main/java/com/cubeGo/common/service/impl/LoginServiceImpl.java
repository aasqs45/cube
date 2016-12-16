package com.cubeGo.common.service.impl;

/**
 * Created by sunyao on 10/14/16.
 */
import javax.annotation.Resource;

import com.cubeGo.common.service.ILoginService;
import org.springframework.stereotype.Service;
import com.cubeGo.common.mappers.UserMapper;
import com.cubeGo.common.beans.User;

@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User Login(String username, String password) {
        return userMapper.login(username, password);
    }

}