package com.swjd.demo2.mapper;

import com.swjd.demo2.pojo.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {
    //@Select("select * from tb_account where id = #{id}")
    Account queryById(Long id);

//    @Select("select * from tb_account")
//    List<Account> findall(Long id);
}
