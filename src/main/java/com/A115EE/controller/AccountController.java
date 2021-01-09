package com.A115EE.controller;

import com.A115EE.domain.Account;
import com.A115EE.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 账户的表现层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	/**
	 * 查询账户
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		System.out.println("表现层：查询所有账户...");
		List<Account> accountList = accountService.findAll(); //调用Service方法
		model.addAttribute("accountList", accountList);
		return "list";
	}

	/**
	 * 保存账户
	 */
	@RequestMapping({"/saveAccount"})
	public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
		accountService.saveAccount(account);
		response.sendRedirect(request.getContextPath() + "/account/findAll");
		return;
	}

}
