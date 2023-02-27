package com.lylechristine.springboottogcp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello_message(@RequestParam(name="msg",defaultValue="World")String msg)
    {
        return "Hello " +msg ;
    }
}
