package com.A115EE.service;

import com.A115EE.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface AccountService {

	/**
	 * 查询所有账户信息
	 */
	List<Account> findAll();

	/**
	 * 保存账户信息
	 */
	void saveAccount(Account account);

}
