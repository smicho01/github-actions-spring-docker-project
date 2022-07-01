package com.severinu.gitgubactionsspringgradleproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @RequestMapping("/")
    public String index() {
        return "App is working ...";
    }
}
