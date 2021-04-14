package com.shangma.cn.controller;

import com.shangma.cn.Utils.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class PageJumpController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("getEmailCode")
    public String getEmailCode(String email){
        emailService.sendMail(email);
        stringRedisTemplate.opsForValue().set(email,"666666",3, TimeUnit.MINUTES);


        return "OK";
    }

}
