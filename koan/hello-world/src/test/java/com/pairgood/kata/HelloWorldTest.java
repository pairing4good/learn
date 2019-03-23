package com.pairgood.kata;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void say_ShouldReturnHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();

        String actualMessage = helloWorld.say();

        Assert.assertEquals("Hello World!", actualMessage);
    }

    @Test
    public void say_WithName_ShouldReturnHelloWorld_WithName(){
        HelloWorld helloWorld = new HelloWorld();

        String actualMessage = helloWorld.say("Bob");

        Assert.assertEquals("Hello World Bob!", actualMessage);
    }
}
