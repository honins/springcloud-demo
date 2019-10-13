package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService
{
    @Autowired
    RestTemplate restTemplate;

    public Object hiService(String name)
    {
        return restTemplate.getForEntity("http://SERVICE-HI/hi?name=" + name, Object.class);
    }


}