package com.jerry.controller;

import com.jerry.feign.MemberFeign;
import com.jerry.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberFeign memberFeign;
    @RequestMapping("/registaction")
    public String register(String userName, String email, String password, String sex, Model model){
        memberFeign.register(userName,email,password,sex);
        return "registSuccess";
    }
}
