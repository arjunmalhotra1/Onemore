package com.example.First_self.dto;
import java.util.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot";
    }

    @RequestMapping("/getAString")
         public String getA()
    {
        return "Inside getAString";
    }

    @RequestMapping(value = "/getA", method= RequestMethod.GET)
    public String getAString()
    {
        return "Java Backend 2";
    }

    @RequestMapping(value="/search")
    public String getitem(@RequestParam("q") String data)
    {
        return "Hi"+data;
    }

    //http://localhost:8080/searchAword?q=Arjun
    @RequestMapping(value="/searchAword",method= RequestMethod.GET)
    public List<String> searchword(@RequestParam("q") String q)
    {
        SearchService service=new SearchService();
        return(service.searchAword(q));
    }

    //https://api.github.com/users/%s    => Path Variable API
    @RequestMapping(value="/users/{id}",method= RequestMethod.GET)
    public User getAUser(@PathVariable("id") String id)
    {
        UserService service=new UserService();
        return(service.getAUser(id));
    }

    @PostMapping(path="/userspost",consumes = "application/json",produces = "application/json")
    public User addUser(@RequestBody User user)
    {
        System.out.print("Post call for Use Creation");
        //AddUser -> Add a user to the Data Store
        return user;
    }

    @PutMapping (path="/userput/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public User updateUSer(@PathVariable String id, @RequestBody User user)//These two are the inputs coming in.
    {

        user.setName("Gama");
        return user;
    }

    @DeleteMapping("/usersdelete/{id}")
    public boolean deleteEmployee(@PathVariable(value="id") Long employeeId)
    {
        System.out.println("Delete call for the Employee"+employeeId);
        return true;
    }

}
