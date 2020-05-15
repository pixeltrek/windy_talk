package com.windy.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String name, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("username", name);
System.out.print(name);
        return "chat.html";
    }

    @ResponseBody
    @RequestMapping("/getName")
    public String getName(HttpSession session){
System.out.println("laile");
        String name = (String)session.getAttribute("username");

        return name;
    }
}
