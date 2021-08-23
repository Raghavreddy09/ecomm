package com.productshopping.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productshopping.userservice.entity.User;
import com.productshopping.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User getUserById(int uid) {
		
		return userRepository.findUserByUid(uid);
	}

	@Override
	public User getUserByName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
		 
	}

}
