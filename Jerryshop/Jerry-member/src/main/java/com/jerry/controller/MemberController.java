package com.jerry.controller;

import com.jerry.mapper.MemberMapper;
import com.jerry.result.Result;
import com.jerry.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public Result register(String userName, String email, String password, String sex) {
        return null;
    }

    @Override
    public Result selectByPrimaryKey(Integer id) {
        return null;
    }
}
