package com.darrenforsythe.methodinterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping(value = "/hello/{placeholder}")
    public String hello(@PathVariable String placeholder) {
        return "Hello " + placeholder;
    }
}
