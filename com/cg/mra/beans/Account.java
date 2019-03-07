package com.cg.mra.beans;

public class Account {
private String accountType;
private String customerName;
private static double AccountBalance;

public Account(String string, String string2, int i) {
	// TODO Auto-generated constructor stub
	accountType = string;
	customerName = string2;
	AccountBalance = i;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public static double getAccountBalance() {
	return AccountBalance;
}
public static void setAccountBalance(double accountBalance) {
	AccountBalance = accountBalance;
}

}
