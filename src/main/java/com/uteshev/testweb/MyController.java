package com.uteshev.testweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
