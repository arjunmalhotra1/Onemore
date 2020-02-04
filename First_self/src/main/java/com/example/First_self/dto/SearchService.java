package com.example.First_self.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SearchService {

    public List<String> searchAword(String q) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(q);
        list.add(" is");
        list.add("A great");
        list.add("Batsman");

        HashMap<String, ArrayList<String>> store = new HashMap<String, ArrayList<String>>();
        store.put(q, list);

        return store.get(q);
    }
}
