package com.chaewoo.spring_docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class sampleController {
    
    @GetMapping("/")
    public String main(){
        System.out.println("start");
        return "main";
    }
}
