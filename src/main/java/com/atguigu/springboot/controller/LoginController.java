package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam String username,@RequestParam String password, Map<String,Object> map, HttpSession session) {
        if (username != null && "password".equals("password")) {
            session.setAttribute("loginuser",username);
            System.out.println("用户以经登陆成功");
            return "redirect:/dashboard";
        } else{
            map.put("msg","用户名密码错误");
            System.out.println("我出错了");
            return "login";
        }
    }
}

