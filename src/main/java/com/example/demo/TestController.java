package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by orchid0809 on 2018/10/28.
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello jenkins";
    }
}
