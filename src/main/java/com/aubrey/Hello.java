package com.aubrey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aubrey on 2017-3-26.
 */

@RestController
public class Hello {

    @Value("${book.name}")
    private String bookName;


    @RequestMapping("/hello")
    public String hello(){
        System.out.println(bookName);
        return "this is a springboot intellij  web project 888888888888888888888888888888";
    }
}
