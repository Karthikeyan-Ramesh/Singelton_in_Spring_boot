package com.singelton.java.springBoot.controller;

import com.singelton.java.springBoot.Singelton;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(value = "/value", method = RequestMethod.GET)
    public String apiHome() {

        return "Welcome" + Singelton.getInstance().getValue();
    }

}
