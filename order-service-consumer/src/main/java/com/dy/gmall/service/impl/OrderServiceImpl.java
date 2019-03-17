package com.dy.gmall.service.impl;


import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
 *  1.在spring.xml文件中进行配置
 *     1.1 配置消费服务名称
 *     1.2 配置zookeeper注册中心
 *     1.3 配置需要调用的远程服务接口
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<User> userList=userService.getUser();
        for (User user:userList){
            System.out.println(user.toString());
        }
    }
}
