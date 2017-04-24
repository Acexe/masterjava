package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendToGroup(
                ImmutableSet.of(new Addressee("Anton <antzub@ya.ru>")),
                ImmutableSet.of(new Addressee("Мастер Java <acexe7@gmail.com>")), "Subject", "Body");
    }
}