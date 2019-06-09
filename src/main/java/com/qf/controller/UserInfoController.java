package com.qf.controller;

import com.qf.entity.UserInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 2019/6/10.
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserService userService;
    @RequestMapping("listAllUserInfo")
    public Object listAllUserInfo(){
        List<UserInfo> users = userService.findAllUser();
        return users;
    }
}
