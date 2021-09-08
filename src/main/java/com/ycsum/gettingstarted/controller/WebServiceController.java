package com.ycsum.gettingstarted.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {

    @GetMapping("/rest")
    public String sayRest() {
        return "test REST";
    }
}
