package com.zeek.mybatis3.mapper;

import com.zeek.mybatis3.po.User;

/**
 * 
 * <p>Description: mapper接口，相当 于dao接口，用户管理</p>
 */
public interface UserMapper {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
