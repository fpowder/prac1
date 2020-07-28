package com.example.prac1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Service {

    @RequestMapping(value="/")
    public String index(Model model){


        return "test";
    }

}
