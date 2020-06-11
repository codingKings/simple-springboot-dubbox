package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("test")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @Autowired
    private User user;

    @RequestMapping("/user")
    public String testUser(){
        return user.getUserName()+user.getPassword();
    }

    @Value("${uName}")
    private String userName1;
    @Value("${password}")
    private String password;

    @RequestMapping("/pro")
    public String testPro(){
        return userName1+password;
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/testQueryListUser")
    public List<User> testQureyListUser(){
        return userService.querUserList();
    }
}
