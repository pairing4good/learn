package com.pairgood.kata;

public class HelloWorld {

    public String say(String name) {

        String message = "Hello World";
        if(name != null && name.length() > 0){
            message += " " + name;
        }
        return message + "!";
    }
}
