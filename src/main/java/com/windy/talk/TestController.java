package com.windy.talk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String say(){
        return "hello world";
    }

    public static void main(String[] args) {
        String a = "aaa说： It's too good to be true";
        String substring = a.substring(a.indexOf("说"), a.length());
        System.out.println(substring);
    }
}
