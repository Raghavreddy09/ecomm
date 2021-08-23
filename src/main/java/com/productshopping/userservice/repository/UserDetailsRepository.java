package com.productshopping.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.productshopping.userservice.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {

}
