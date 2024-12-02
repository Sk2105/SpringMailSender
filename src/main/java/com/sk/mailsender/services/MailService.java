package com.sk.mailsender.services;


import com.sk.mailsender.model.MailDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {


    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(MailDTO mailDTO) {
        String to = mailDTO.to();
        String subject = mailDTO.subject();
        String text = mailDTO.text();
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(to);
            mailMessage.setSubject(subject);
            mailMessage.setText(text);
            javaMailSender.send(mailMessage);
        } catch (Exception e) {
            log.error("Error while sending mail", e);
        }

    }


}
