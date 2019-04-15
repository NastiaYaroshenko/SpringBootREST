package com.example.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.beans.User;
import com.example.beans.UserRegistration;

@Controller
public class UserUpdateController {
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/user")
	@ResponseBody
	public String updateUserRecord(@RequestBody User user) {
	System.out.println("In updateUserRecord");   
	    return UserRegistration.getInstance().upDateUser(user);
	}
}
