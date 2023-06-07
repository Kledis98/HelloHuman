package com.codingdojo.hellohuman.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Greetings {
    @RequestMapping("/")
    public  String hello
            (@RequestParam(value = "name", required=false)String name,
            @RequestParam(value = "last_name", required= false) String lastname,
            @RequestParam(value ="times", required = false) String times){
        if (name !=null && lastname !=null ){
            return "Hello "+name + " " + lastname;
    }
        else if (name !=null){
            return "Hello " + name;
        }
        else if (lastname !=null){
            return "Hello " + lastname;
        }
        else {
            return "Hello human";
        }
        }
}
