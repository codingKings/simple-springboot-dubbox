package com.eway.userconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.eway.pojo.User;
import com.eway.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author: 程龙
 * @Date: 2020-06-10 8:44
 */

@RestController
@RequestMapping("consumer")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @Reference
    private UserService userService;

    @RequestMapping("/testQuery")
    public List<User> testQuery(){
        return userService.querUserList();
    }
}
