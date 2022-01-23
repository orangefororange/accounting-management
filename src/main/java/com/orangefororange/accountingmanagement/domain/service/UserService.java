package com.orangefororange.accountingmanagement.domain.service;

import com.orangefororange.accountingmanagement.domain.entity.po.AccountUser;
import com.orangefororange.accountingmanagement.infrastructure.mapper.AccountUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author ：orange for orange
 * @date : 2022/1/23
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final AccountUserMapper accountUserMapper;

    public void signUp(AccountUser user){
        Example example = new Example(AccountUser.class);
        example.createCriteria().andEqualTo("username",user.getUsername())
                .andEqualTo("dr",0);
        List<AccountUser> users = accountUserMapper.selectByExample(example);
        if(!users.isEmpty()){
        }else {
            accountUserMapper.insertSelective(user);
        }
    }
}
