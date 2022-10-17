package com.gl.caseStudy.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUsers extends User{
	
	@Id
	private String username;
	private String password;
	
	public MyUsers() {
		super("Marigold","Mango",new ArrayList<>());
	}

	public MyUsers(String username, String password, Collection<? extends GrantedAuthority> authorities,String username2,String password2) {
		super(username, password, authorities);
		username = username2;
		password = password2;
	}

	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return " " + username + " " + password;
	}
	
	
}
