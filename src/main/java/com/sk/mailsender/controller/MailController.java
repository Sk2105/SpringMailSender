package com.sk.mailsender.controller;


import com.sk.mailsender.model.MailDTO;
import com.sk.mailsender.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {


    @Autowired
    private MailService mailService;



    @PostMapping
    public String sendMail(@RequestBody MailDTO mailDTO) {
        mailService.sendMail(mailDTO);
        return "Mail Sent Successfully";
    }
}
