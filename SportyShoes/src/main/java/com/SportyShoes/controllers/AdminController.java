package com.SportyShoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SportyShoes.Repository.AdminRepository;
import com.SportyShoes.model.Admin;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminRepository adminrepo;
	@GetMapping("/login")
	public String logIn()
	{
		return "Successfully login";
	}
	@PostMapping("/login1")
	public Admin valid(@RequestBody Admin admin)
	{
		return adminrepo.save(admin);
	}

}
