package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.exception.NumberException;

public interface AccountDao {
Account getAccountDetails(String mobileNo) throws NumberException;
int rechargeAccount(String mobileNo,double rechargeAmount) throws NumberException;
}
