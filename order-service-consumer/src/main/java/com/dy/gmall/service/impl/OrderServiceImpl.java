package com.dy.gmall.service.impl;


import bean.User;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *  1.1 如何暴露服务
 *      pom.xml引入dubbo
 *  1.2 注册中心使用zookeeker ,引入操作zookeeper的客户端
 *      2.6.2及以后版本使用curator ,2.6以下使用zkclient
 *  1.3 配置服务提供者
 *
 * 2.将服务消费者到注册中性订阅
 *
 *
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<User> userList=userService.getUser();
    }
}
