package com.example.rest.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.User;
import com.example.beans.UserRegistrationService;

@Controller
public class UserController {
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/user/{id}")
	@ResponseBody
	public String deleteUserRecord(@PathVariable("id") String id) {
	System.out.println("In deleteUserRecord");   
	    return UserRegistrationService.getInstance().deleteUser(id);
	}
	
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
	
	@RequestMapping(method = RequestMethod.GET, value="/user/alluser")
	@ResponseBody
	public List<User> getAllUsers() {
		return UserRegistrationService.getInstance().getUserRecords();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/user")
	@ResponseBody
	public String updateUserRecord(@RequestBody User user) {
	System.out.println("In updateUserRecord");   
	    return UserRegistrationService.getInstance().upDateUser(user);
	}
}
