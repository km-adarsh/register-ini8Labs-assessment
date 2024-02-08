package com.example.register.controller;

import java.security.PublicKey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.register.entity.User;
import com.example.register.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// method to handle users and return model and view

	@GetMapping("/users")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}

	@GetMapping("/users/new")
	public String createUser(Model model) {
		// below user object holds form data
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
	}

	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/users";

	}

	@GetMapping("/users/edit/{id}")
	public String editUser(@PathVariable int id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit_user";

	}

	@PostMapping("/users/{id}")
	public String updateUser(@PathVariable int id, @ModelAttribute("user") User user, Model model) {
		User existingUser = userService.getUserById(id);
		existingUser.setId(id);
		existingUser.setName(user.getName());
		existingUser.setDob(user.getDob());
		existingUser.setCity(user.getCity());
		existingUser.setEmail(user.getEmail());
		existingUser.setPhone(user.getPhone());
		existingUser.setUsername(user.getUsername());
		existingUser.setPassword(user.getPassword());
		
		userService.updateUser(existingUser);
		return "redirect:/users";

	}
	
	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		userService.deleteUserById(id);
		return "redirect:/users";
	}
}
