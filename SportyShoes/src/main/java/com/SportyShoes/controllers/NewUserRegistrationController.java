package com.SportyShoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SportyShoes.Repository.NewUserRegistrationRepository;
import com.SportyShoes.model.NewUserRegistration;
@RestController
@RequestMapping("/newUser")
public class NewUserRegistrationController {
	@Autowired
	NewUserRegistrationRepository userRegRepo;
	@PostMapping("/adduser")
	public NewUserRegistration addUser(@RequestBody NewUserRegistration user )
	{
		return userRegRepo.save(user);
	}
	

}
