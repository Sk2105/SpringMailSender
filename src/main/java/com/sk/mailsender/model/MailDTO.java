package com.sk.mailsender.model;

public record MailDTO(
    String to,
    String subject,
    String text
) {
}
