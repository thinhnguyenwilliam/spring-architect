package com.thinhgroup.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
    @GetMapping( "/v1/api/hello")
    public String hello()
    {
        return "Hello World!";
    }

}
