package com.intfish.resourceserver.controller;

import com.intfish.resourceserver.util.JacksonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @PostMapping("get-user-info")
    public Principal getUserInfo(Authentication authentication) throws Exception {
        log.info("获取用户信息；"+ JacksonUtils.obj2json(authentication));
        return authentication;
    }
}
