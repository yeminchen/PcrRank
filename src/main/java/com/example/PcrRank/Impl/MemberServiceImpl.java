package com.example.PcrRank.Impl;

import com.example.PcrRank.Dao.MemberDao;
import com.example.PcrRank.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public String login(String username, String pwd) {
        Integer num = memberDao.countAllByUsernameAndPasswordAndActive(username, pwd, 1);
        if (num > 0) {
            return "1";
        } else {
            return "0";
        }
    }
}
