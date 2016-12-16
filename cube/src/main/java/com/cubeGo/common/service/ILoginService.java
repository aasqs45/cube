package com.cubeGo.common.service;

import com.cubeGo.common.beans.User;

/**
 * Created by sunyao on 10/14/16.
 */
public interface ILoginService {

    public User Login(String username,String password);


}