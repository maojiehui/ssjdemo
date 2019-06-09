package com.qf.service;

import com.qf.dao.UserDao;
import com.qf.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by DELL on 2019/6/10.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public List<UserInfo> findAllUser() {
        List<UserInfo> userInfoList =userDao.findAllUsers();
        System.out.println(userInfoList.size());
        return userInfoList;
    }
}
