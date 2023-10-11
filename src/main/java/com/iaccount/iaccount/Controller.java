package com.iaccount.iaccount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping ("/account")
    public String index(){
        return "Hi Rani & Dipanita :)";
    }
}
