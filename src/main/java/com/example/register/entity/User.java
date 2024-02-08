package com.example.register.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Date_of_Birth")
	private String dob;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Phone_Number")
	private String phone;
	
	
	@Column(name = "Email_ID", nullable = false)
	private String email;
	
	@Column(name = "Username", nullable = false)
	private String username;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	public User()
	{
		
	}
	public User(String name, String dob, String city, String phone, String email, String username, String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
