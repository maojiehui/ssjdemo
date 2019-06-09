package com.qf.dao;

import com.qf.entity.UserInfo;

import java.util.List;

/**
 * Created by DELL on 2019/6/10.
 */
public interface UserDao {
    public List<UserInfo> findAllUsers();
}
