package com.jerry.service;

import com.jerry.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
public interface MemberService {
    @RequestMapping("/register")
    public Result register(String userName, String email, String password, String sex);

    @RequestMapping("/selectByPrimaryKey")
    public Result selectByPrimaryKey(Integer id);
}
