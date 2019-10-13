package com.example.controller;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HomeController {

    @Value("${server.port}")
    String port;

//    @RequestMapping("/hi")
//    public String home(@RequestParam String name)
//    {
//        return "hi " + name + ",i am from port:" + port;
//    }


    @RequestMapping("/hi")
    public Object hiForObject(@RequestParam String name)
    {
        HashMap<Object, Object> map = new HashMap<>();
        User user = new User(1, "8763'name ");
        String str ="hi " + name + ",i am from port:" + port;
        map.put("user",user);
        map.put("str",str);
        return map;
    }


}
