package com.betaplan.angela.springlesson.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/") //same thing as localhost:8080
    public String work() {
        return "This is working!";
    }

    @RequestMapping ("/test")
    public String test(){
        return "Testing if this is working";
    }
    @RequestMapping("/students")
    //query parameter
        public String student(@RequestParam (value="name", required = false) String name){
            return String.format("Welcome %s", name);
        }
     @RequestMapping("/students/{name}/{stack}")
    //path variable
    public String studentInfo(@PathVariable String name,@PathVariable String stack) {
        return String.format("Hi, %s and welcome to %s",name , stack);
     }

}
