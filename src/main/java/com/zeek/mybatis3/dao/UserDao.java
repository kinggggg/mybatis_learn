package com.zeek.mybatis3.dao;

import com.zeek.mybatis3.po.User;

public interface UserDao {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
