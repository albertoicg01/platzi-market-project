package com.platzi.market;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salutation")
public class HelloWorldController {

    @GetMapping("/hello")
    public String salutation(){
        return "Never stop learning  :)";
    }
}
