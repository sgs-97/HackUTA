package com.uta.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@Service
@RestController
public class URLDetector {

    List<String> spamurls= new ArrayList<>();

    @RequestMapping("/testurl/**")
    public boolean test(HttpServletRequest request) {
        String fullUrl = request.getRequestURL().toString();
        String url = fullUrl.split("/testurl/")[1];
        System.out.println(url);
        spamurls.add("http://citibankking.com");
        spamurls.add("http://utaa.com");
        spamurls.add("http://wellsffargo.com");
        boolean flag =false;

        if(spamurls.contains(url))
        {
            flag=true;
        }

        return flag;
    }
}
