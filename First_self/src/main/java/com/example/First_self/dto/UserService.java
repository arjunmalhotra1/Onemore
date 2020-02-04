package com.example.First_self.dto;

public class UserService {

    public  User getAUser(String id)
    {
        UserDataStore dataStore=new UserDataStore();
        return dataStore.getAUser(id);
    }

}
