package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.exception.NumberException;
import com.cg.mra.ui.MainUI;

public class AccountDaoImpl implements AccountDao {
	Map<String,Account> accountEntry;
	MainUI m = new MainUI();
		// TODO Auto-generated method stub

public  AccountDaoImpl() {
	accountEntry=new HashMap<>();
	accountEntry.put("7285999009", new Account("Prepaid","Vaishali",200));
	accountEntry.put("9823920123", new Account("Prepaid","megha",453));
	accountEntry.put("9932012345", new Account("Prepaid","vikas",631));
	accountEntry.put("9010210131", new Account("Prepaid","tushar",632));
	
}



	@Override
	public Account getAccountDetails(String mobileNo)  {
		
	 Account a = null;
	 if(mobileNo.length()==10) {
		 
	 
	            // Check if this key is the required key 
	            if (accountEntry.containsKey(mobileNo)) { 
	  
	            a= accountEntry.get(mobileNo);
	          System.out.println(a.getAccountBalance());
	            }
	            else {
	            	System.out.println("ERROR: Cannot recharge account as given no does exists");
	            }
	            m.options();
	 } else
		try {
			throw new NumberException();
		} catch (NumberException e) {
			// TODO Auto-generated catch block
			
		}m.options();
		return a;
		
	}



	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) throws NumberException {
		// TODO Auto-generated method stub
		Account a= null;
		if(mobileNo.length()==10) {
			
		
		 if (accountEntry.containsKey(mobileNo)) {
			a =accountEntry.get(mobileNo);
			 double r=a.getAccountBalance()+rechargeAmount;
			 System.out.println("current balance is"+r);
			 a.setAccountBalance(r);
			m.options();
		 }
		 else {
			 System.out.println("cannot recharge account as given mobile no does not exsist");
		 }
		}
		 else {
			 throw new NumberException();
			 }
		
		return 0;
	}

}
