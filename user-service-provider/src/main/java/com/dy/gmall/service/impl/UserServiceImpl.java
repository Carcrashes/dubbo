package com.dy.gmall.service.impl;


import bean.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUser() {
        List<User> list=new ArrayList<>();
        User user=new User(1,"长沙","001","zs","15878784463","男");
        User user2=new User(2,"北京","002","ls","15878784463","男");
        return Arrays.asList(user,user2);
    }
}
