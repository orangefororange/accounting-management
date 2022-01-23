package com.orangefororange.accountingmanagement.application;

import com.orangefororange.accountingmanagement.domain.entity.params.UserParam;
import com.orangefororange.accountingmanagement.domain.entity.po.AccountUser;
import com.orangefororange.accountingmanagement.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ：orange for orange
 * @date : 2022/1/22
 */
@RequestMapping("/api/account/user")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService userService;

    @PostMapping("/signUp")
    public void signUp(@RequestBody UserParam userParam){
        AccountUser accountUser = new AccountUser();
        BeanUtils.copyProperties(userParam,accountUser);
        userService.signUp(accountUser);
    }
}
