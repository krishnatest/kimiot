package com.dxc.ms.iot;

import java.io.Serializable;

public class Users implements Serializable {
	//private static final long serialVersionUID = 1L;
	private String usersFname;
	private String usersLname;
	private String usersShortId;
	private String usersPassword;
	private String mobile;
	private String address;

	public String getUsersFname() {
		return usersFname;
	}
	public void setUsersFname(String usersFname) {
		this.usersFname = usersFname;
	}
	public String getUsersLname() {
		return usersLname;
	}
	public void setUsersLname(String usersLname) {
		this.usersLname = usersLname;
	}
	public String getUsersShortId() {
		return usersShortId;
	}
	public void setUsersShortId(String usersShortId) {
		this.usersShortId = usersShortId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsersPassword() {
		return usersPassword;
	}
	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}

	
}

