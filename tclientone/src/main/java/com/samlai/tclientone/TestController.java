package com.samlai.tclientone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-04-03 14:50
 * @ Description：
 */
@RestController
public class TestController {


//    @Resource
//    private DiscoveryClient discoveryClient;


    @GetMapping("/dc")
    public String dc() {
        String services = "services  client";
        System.out.println(services);
        return services;
    }




}
