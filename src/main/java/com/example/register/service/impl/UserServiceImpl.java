package com.example.register.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.register.entity.User;
import com.example.register.repository.UserRepository;
import com.example.register.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}


	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}


	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}


	@Override
	public User getUserById(int id) {
		
		return userRepository.findById(id).get();
	}


	@Override
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
		
	}

}
