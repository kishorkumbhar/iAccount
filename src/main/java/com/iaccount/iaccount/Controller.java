package com.iaccount.iaccount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping ("/")
    public String index(){
        return "Hi from private API";
    }
}
