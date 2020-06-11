package com.eway.userprovider.mapper;

import com.eway.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 程龙
 * @Date: 2020-06-10 11:52
 */

@Mapper
public interface UserMapper {

    List<User> querUserList();
}
