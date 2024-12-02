package com.sk.mailsender;


import com.sk.mailsender.services.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
public class MailServiceText {


    @Autowired
    private MailService mailService;


}
