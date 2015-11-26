package com.controller;

import com.domain.User;
import com.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Wanglei on 15/11/26.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping(method = RequestMethod.GET)
    public String demoIndex(){
        List<User> userList = userServices.getUserList();
        System.out.println("======= user list:" + userList);
        return "index";
    }
}
