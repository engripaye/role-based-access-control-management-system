package dev.engripaye.role_based_access_control_management_system.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public/hello")
    public String publicHello(){

        return "Hello, this is a public endpoint!";
    }

    @GetMapping("user/greeting")
    @PreAuthorize("hasRole('USER')")
    public String userGreeting(){

        return "Hello User, Access has been granted!";

    }

    @GetMapping("admin/greeting")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminGreeting(){
        return "Welcome to the Admin Dashboard";
    }

}
