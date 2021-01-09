package com.A115EE.test;

import com.A115EE.domain.Account;
import com.A115EE.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testService() {

		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		//获取对象
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

		//调用Service的方法
		accountService.findAll();
	}

}
