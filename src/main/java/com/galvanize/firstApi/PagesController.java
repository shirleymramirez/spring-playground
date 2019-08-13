package com.galvanize.firstApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/math/pi")
    public String pi() {
        return "3.141592653589793";
    }
}
