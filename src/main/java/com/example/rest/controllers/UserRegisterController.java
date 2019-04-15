package com.example.rest.controllers;

import com.example.beans.UserRegistration;
import com.example.beans.UserRegistrationReply;
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
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		UserRegistrationReply userregreply = new UserRegistrationReply();           
		UserRegistration.getInstance().add(user);
		//We are setting the below value just to reply a message back to the caller
		userregreply.setName(user.getName());
		userregreply.setAge(user.getAge());
		userregreply.setId(user.getId());
		userregreply.setStatus("Successful");
		return userregreply;
	}
}
