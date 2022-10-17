package com.gl.caseStudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.caseStudy.bean.MyUsers;
import com.gl.caseStudy.repository.MyUsersRepository;

@Service
public class MyUsersService implements UserDetailsService  {
	
	@Autowired
	private MyUsersRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		return repository.findById(username).get();
	}
	public void save(MyUsers users) {
		repository.save(users);
	}
}
