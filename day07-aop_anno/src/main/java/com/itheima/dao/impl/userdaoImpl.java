package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

import java.util.Date;

public class userdaoImpl implements UserDao {
    public void save() {
        System.out.println("修改/保存成功");
    }

    public Object delete() {
        System.out.println("userdaoImpl.delete");
        return "获取返回值";
    }

    public void showTime() {
        System.out.println("环绕通知测试");
    }

    public void showExc() {
        int i = 1/0;
        System.out.println("123455");
    }


}
