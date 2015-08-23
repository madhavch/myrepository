package org.mysolutions.persistent.model;

import java.io.Serializable;

public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8511792821308966767L;
	
	private String userName;
	private long   userContactNumber;
	private long   userAlternateContactNumber;
	private String permanentAddress;
	private String temparoryAddress;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	public long getUserAlternateContactNumber() {
		return userAlternateContactNumber;
	}
	public void setUserAlternateContactNumber(long userAlternateContactNumber) {
		this.userAlternateContactNumber = userAlternateContactNumber;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getTemparoryAddress() {
		return temparoryAddress;
	}
	public void setTemparoryAddress(String temparoryAddress) {
		this.temparoryAddress = temparoryAddress;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

}
