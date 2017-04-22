package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableList;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendMail(
                ImmutableList.of(new Addressee("Anton <antzub@ya.ru>")),
                ImmutableList.of(new Addressee("Мастер Java <acexe7@gmail.com>")), "Subject", "Body");
    }
}