package com.example.First_self.dto;

import java.util.ArrayList;
public class UserDataStore {
    public  User getAUser(String id)
    {
        ArrayList<User> list=new ArrayList<User>();
        User u1=new User();
        u1.setId("1");
        u1.setName("Ramu");
        list.add(u1);

        return list.get(0);
    }

}
