package com.miku.controller;

import com.miku.common.R;
import com.miku.entity.User;
import com.miku.utils.jwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@Slf4j
public class LoginController {

    @PostMapping("/login")
    public R<User> login(@RequestBody User user){
        String token = jwtUtils.getToken(user);
        log.info("sasad" +token);
        String id = jwtUtils.dealToken(token);
        log.info(id);
        user.setToken("asdasd" + token);
        return R.success(user);
    }


}

