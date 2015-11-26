package com.service;

import com.domain.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wanglei on 15/11/26.
 */
@Service("userService")
public class UserServices {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(){
        return userMapper.findUserList();
    }
}
