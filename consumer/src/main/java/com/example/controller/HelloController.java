package com.example.controller;

import com.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author home-pc
 */
@RestController
public class HelloController
{

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public Object hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }

}
