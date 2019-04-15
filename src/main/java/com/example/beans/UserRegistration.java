package com.example.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	
	private List<User> UserRecords;
    private static UserRegistration userreg = null;
    
    private UserRegistration(){
    UserRecords = new ArrayList<User>();
    }
    
    public static UserRegistration getInstance() {
        if(userreg == null) {
              userreg = new UserRegistration();
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
              UserRecords.set(i, us);//update the new record
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
              UserRecords.remove(i);//update the new record
              return "Delete successful";
            }
        }
    	return "Delete un-successful";
    }
    
    public List<User> getUserRecords() {
    	return UserRecords;
    }
}
