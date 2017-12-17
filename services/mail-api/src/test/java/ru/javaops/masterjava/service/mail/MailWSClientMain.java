package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;
import ru.javaops.masterjava.web.WebStateException;

@Slf4j
public class MailWSClientMain {
    public static void main(String[] args) throws WebStateException {
        String state = MailWSClient.sendToGroup(
                ImmutableSet.of(new Addressee("To <acexe7@gmail.com>")),
                ImmutableSet.of(new Addressee("Copy <acexe7@gmail.com>")), "Subject", "Body");
        System.out.println(state);
    }
}