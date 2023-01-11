package com.example.csrfdemo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final Logger logger=
            Logger.getLogger(ProductController.class.getName());

    @PostMapping("/add")
    public String add(@RequestParam String name){
        logger.info("Adding Product: "+ name);
        return "main";
    }
    @ResponseBody
    @PostMapping("/hello")
    public String hello(){
        return "Hello!";
    }
    //curl -XPOST -H "X-IDENTIFIER:12345" -H "X-CSRF-TOKEN:b4b6d890-6fd1-4ac1-ba59-2acc2c48d4cf" localhost:8080/product/bye
    @ResponseBody
    @GetMapping("/welcome")
    public String hello2(){
        return "GET Hello!";
    }

    @PostMapping("/bye")
    @ResponseBody
    public String bye(){
        return "POST Bye!";
    }

}
