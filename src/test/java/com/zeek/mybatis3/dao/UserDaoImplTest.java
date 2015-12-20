package com.zeek.mybatis3.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zeek.mybatis3.dao.UserDao;
import com.zeek.mybatis3.po.User;

public class UserDaoImplTest {
	
	private ApplicationContext applicationContext;

	// 此方法是在执行testFindUserById之前执行
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		
		System.out.println(user);
	}

}
