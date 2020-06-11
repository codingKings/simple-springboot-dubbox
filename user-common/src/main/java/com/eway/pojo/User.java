package com.eway.pojo;

import java.io.Serializable;

/**
 * @Author: 程龙
 * @Date: 2020-06-10 8:47
 * @Desc: provider和model都要使用的module
 */
public class User implements Serializable {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
