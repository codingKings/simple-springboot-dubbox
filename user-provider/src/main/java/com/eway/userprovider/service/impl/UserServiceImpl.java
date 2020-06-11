package com.eway.userprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.eway.pojo.User;
import com.eway.service.UserService;
import com.eway.userprovider.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @Author: 程龙
 * @Date: 2020-06-10 13:25
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> querUserList() {
        return userMapper.querUserList();
    }
}
