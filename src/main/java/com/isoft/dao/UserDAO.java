package com.isoft.dao;

import com.isoft.dbutil.DBUtils;
import com.isoft.pojo.User;

import java.util.List;

public class UserDAO {
    public List<User> findAllUser(){
        DBUtils dbUtils=new DBUtils();
        return dbUtils.findAllUser();
    }
    public int login(User user) {
        DBUtils dbUtils=new DBUtils();
        int temp=dbUtils.login(user);
        return temp;
    }
}
