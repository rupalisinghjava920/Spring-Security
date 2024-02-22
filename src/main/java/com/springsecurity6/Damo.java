package com.springsecurity6;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.SQLOutput;

public class Damo {

    public static void main(String []args){
        System.out.println(new BCryptPasswordEncoder().encode("1234"));
    }
}
