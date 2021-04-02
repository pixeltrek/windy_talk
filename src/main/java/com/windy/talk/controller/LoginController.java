package com.windy.talk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class LoginController {
    @RequestMapping(value = "/login" ,produces = "application/json; charset=utf-8")
    public String login(String name, HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        session.setAttribute("username", name);
System.out.println(name);
        String newName = new String(name.getBytes("iso-8859-1"),"utf-8");
        System.out.println("newname是"+newName);
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
