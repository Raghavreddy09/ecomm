package com.productshopping.userservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users")
public class User {
	
	@Id
	private int uid;
	
	private String userName;
	
	private String userPassword;
	
	private UserDetails userDetails;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public User(int uid, String userName, String userPassword, UserDetails userDetails) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userDetails = userDetails;
	}

	public User() {
		super();
	} 	
	
	
	
	
	
	
}
