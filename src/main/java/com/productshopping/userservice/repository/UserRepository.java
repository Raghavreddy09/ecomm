package com.productshopping.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.productshopping.userservice.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByUserName(String userName);
	public User findUserByUid(int uid);
}
