package com.aution.model;

public class ModelBid {

	private String amount;
	private String userName;
	private String email;
	private String phoneNumber;
	private String address;
	private String pid;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return "bidder [amount=" + amount + ", userName=" + userName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
