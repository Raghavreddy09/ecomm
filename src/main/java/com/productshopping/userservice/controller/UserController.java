package com.productshopping.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productshopping.userservice.entity.User;
import com.productshopping.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
  
	
	@GetMapping("/test")
	public String test() {
		return "working";
	}
	
	@PostMapping("/new")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		User registeredUser = userService.saveUser(user);
		
		return new ResponseEntity<>(registeredUser, HttpStatus.OK);   		
		
	}
	@GetMapping(value = "/show",params = "uname")
	public ResponseEntity<User> getUserByName(@RequestParam String uname) {
		User user = userService.getUserByName(uname);
		return new ResponseEntity<>(user, HttpStatus.OK);   		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById( @PathVariable int  id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);   		
		
	}

}
