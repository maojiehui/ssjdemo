package com.qf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DELL on 2019/6/10.
 */
@Entity
@Table(name="userinfo")
public class UserInfo {

    @Column(name = "userid")
    int userId;
    @Column(name="username")
    String userName;

    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
