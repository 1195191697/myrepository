package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
    @GetMapping("/emps")
    public String list(){
        return"/emp/list";
    }
}
