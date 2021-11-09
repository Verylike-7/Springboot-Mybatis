package com.swjd.demo2.controller;

import com.swjd.demo2.pojo.Account;
import com.swjd.demo2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    @GetMapping("{id}")
    private Account queryById(@PathVariable("id") Long id){

        return accountService.queryById(id);
    }
}
