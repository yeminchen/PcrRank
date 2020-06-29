package com.example.PcrRank.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.PcrRank.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(@RequestBody JSONObject info) {
        String username = info.getString("username");
        String pwd = info.getString("pwd");

        return memberService.login(username, pwd);
    }


}
