package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.User;

@Service
public class UserRegistrationService {
	
	private List<User> UserRecords;
    private static UserRegistrationService userreg = null;
    
    private UserRegistrationService(){
    UserRecords = new ArrayList<User>();
    }
    
    public static UserRegistrationService getInstance() {
        if(userreg == null) {
              userreg = new UserRegistrationService();
              return userreg;
            }
            else {
                return userreg;
            }
    }
    
    public void add(User us) {
    	UserRecords.add(us);
    }
    
    public String upDateUser(User us) {
    	for(int i=0; i<UserRecords.size(); i++)
        {
            User stdn = UserRecords.get(i);
            if(stdn.getId().equals(us.getId())) {
              UserRecords.set(i, us);
              return "Update successful";
            }
        }
    	return "Update un-successful";
    }
    
    public String deleteUser(String id) {
    	for(int i=0; i<UserRecords.size(); i++)
        {
            User us = UserRecords.get(i);
            if(us.getId().equals(id)){
              UserRecords.remove(i);
              return "Delete successful";
            }
        }
    	return "Delete un-successful";
    }
    
    public List<User> getUserRecords() {
    	return UserRecords;
    }
}
