package com.example.register.service;

import java.util.List;

import com.example.register.entity.User;

public interface UserService {

	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User updateUser(User user);
	
	User getUserById(int id);
	
	void deleteUserById(int id);
}
