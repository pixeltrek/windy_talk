package com.windy.talk.vo;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class Message {
    private String welcome;
    private List<String> userNames;
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getWelcome() {
        return welcome;
    }
    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
    public List<String> getUserNames() {
        return userNames;
    }
    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }
    public Message() {
    }
    public String toJson() {
        return JSONArray.toJSONString(this);
    }
}