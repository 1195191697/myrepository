package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @GetMapping("/index")
    private String Hello(){
        return "login";
    }
    @GetMapping("/dashboard")
    private String hello1(){

        return "dashboard";
    }
    @GetMapping("/nihao")
    private String hello2() {

        return "test";
    }
}
