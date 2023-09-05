package com.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jen")
public class JenkinsController {
    @GetMapping(value="/hello")
    //@ResponseBody
    public String getHello(){
        System.out.println("system....");
        return "hello";
    }
}
