package com.vis.domain.ad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String demo()
    {
        System.out.println("test zz");
        return "/sample/index";
    }

}
