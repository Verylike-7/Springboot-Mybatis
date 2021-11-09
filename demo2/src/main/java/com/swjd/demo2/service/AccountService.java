package com.swjd.demo2.service;

import com.swjd.demo2.mapper.AccountMapper;
import com.swjd.demo2.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public Account queryById(Long id) {

        return accountMapper.queryById(id);
    }

}
