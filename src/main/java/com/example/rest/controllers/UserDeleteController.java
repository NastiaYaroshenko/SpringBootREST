package com.example.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.beans.UserRegistrationService;

@Controller
public class UserDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/user/{id}")
	@ResponseBody
	public String deleteUserRecord(@PathVariable("id") String id) {
	System.out.println("In deleteUserRecord");   
	    return UserRegistrationService.getInstance().deleteUser(id);
	}
}
