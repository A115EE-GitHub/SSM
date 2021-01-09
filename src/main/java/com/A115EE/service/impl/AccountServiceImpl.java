package com.A115EE.service.impl;

import com.A115EE.dao.AccountDao;
import com.A115EE.domain.Account;
import com.A115EE.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	/**
	 * 查询所有账户信息
	 */
	@Override
	public List<Account> findAll() {
		System.out.println("业务层：查询所有账户...");
		return accountDao.findAll();
	}

	/**
	 * 保存账户信息
	 */
	@Override
	public void saveAccount(Account account) {
		System.out.println("业务层：保存账户...");
		accountDao.saveAccount(account);
	}

}
