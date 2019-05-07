package com.jerry.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class TestMemverController {
    @RestController
    public class memberController {
        @Value("${server.port}")//获得端口号
        private String port;
        //    @GetMapping("/hello")
        @RequestMapping("/hello")
        public String helloMember(String name){
            return "hello "+name+",from port:"+port;
        }
    }

}
