package com.jianyi.web.controller;

import com.jianyi.user.api.model.UserInfo;
import com.jianyi.user.api.remote.UserInfoApiRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoApiRemote userInfoApiRemote;

    @GetMapping("user/get")
    public UserInfo get(String userId) {
        return userInfoApiRemote.getByUserId(userId);
    }

}
