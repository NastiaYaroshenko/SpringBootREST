package com.example.rest.controllers;

import com.example.beans.UserRegistrationService;
import com.example.beans.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRegisterController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/user")
	@ResponseBody
	public User registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		User userregreply = new User();           
		UserRegistrationService.getInstance().add(user);
		userregreply.setName(user.getName());
		userregreply.setAge(user.getAge());
		userregreply.setId(user.getId());
		return userregreply;
	}
}
