package com.miku.utils;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.miku.entity.User;
import io.jsonwebtoken.Jwt;

/**
 * 标准的声明，类似开发语言总的关键字。包括
 * iss（Issuser） - 签发者
 * sub Subject 面向主体(要存储的内容) 可以取出来
 * aud Audience 接收方
 * exp Expiration time 过期时间戳
 * nbf Not Before, 开始生效时间戳
 * iat(Issued at) 签发时间
 * jti(JWT ID)： 唯一标识
 */
public class jwtUtils {

    public static String getToken(User user){
        Algorithm algorithm = Algorithm.HMAC256(user.getPassword());
        //把user转成json存进去
        String token = JWT.create().withAudience(user.getUsername()).withSubject(JSON.toJSONString(user)).sign(algorithm);
        return token;
    }
    public static String dealToken(String token){
        System.out.println("asdasd" + JWT.decode(token).getSubject());
        String user = JWT.decode(token).getAudience().get(0);
        return user;
    }

}