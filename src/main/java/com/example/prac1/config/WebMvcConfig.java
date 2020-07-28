package com.example.prac1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    /*public void addVeiwControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("test");
        registry.addViewController("index").setViewName("test");
    }*/

}
