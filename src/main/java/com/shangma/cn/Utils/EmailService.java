package com.shangma.cn.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    public void sendMail(String email){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("Neko<dai18439037494@163.com>");
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("邮箱验证码");
        simpleMailMessage.setText("666666");
        javaMailSender.send(simpleMailMessage);
    }
}
