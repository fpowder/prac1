package com.example.prac1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Service {

    @GetMapping("/")
    public String index(){

        return "index";
    }

}
