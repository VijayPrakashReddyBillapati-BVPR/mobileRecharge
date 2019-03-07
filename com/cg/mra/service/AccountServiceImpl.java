package com.cg.mra.service;

import java.util.Iterator;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.dao.exception.NumberException;

public class AccountServiceImpl implements AccountService {

	AccountDao account=new AccountDaoImpl();
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		
	
	
		try {
			return account.getAccountDetails(mobileNo);
		} catch (NumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	}

	@Override
	public int rechargeAccount(String mobileNo1, double rechargeAmount) {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			d = account.rechargeAccount(mobileNo1, rechargeAmount);
		} catch (NumberException e) {
			// TODO Auto-generated catch block
			
		}
		return d;
	}

}
