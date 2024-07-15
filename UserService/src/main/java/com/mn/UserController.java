package com.mn;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @GetMapping("/user")
    public String getUsers() {
        return "List of users";
    }
}
