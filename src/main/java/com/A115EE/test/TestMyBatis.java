package com.A115EE.test;

import com.A115EE.dao.AccountDao;
import com.A115EE.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Spring配合MyBatis的测试类
 */
public class TestMyBatis {

	/**
	 * 测试查询账户
	 */
	@Test
	public void testMyBatisFindAll() throws Exception {

		//加载MyBatis的配置文件
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

		//创建SqlSession对象
		SqlSession sqlSession = factory.openSession();

		//获取到代理对象
		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

		//查询所有账户
		List<Account> accountList = accountDao.findAll();
		for (Account account : accountList) {
			System.out.println(account);
		}

		//关闭资源
		sqlSession.close();
		inputStream.close();

	}

	/**
	 * 测试查询账户
	 */
	@Test
	public void testMyBatisSaveAccount() throws Exception {

		//加载MyBatis的配置文件
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

		//创建SqlSession对象
		SqlSession sqlSession = factory.openSession();

		//获取到代理对象
		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

		Account account = new Account();
		account.setName("大毛毛小毛毛");
		account.setMoney(520D);

		//保存账户
		accountDao.saveAccount(account);

		sqlSession.commit();

		//关闭资源
		sqlSession.close();
		inputStream.close();

	}

}
