package com.MyBlog.BlogApp.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncodePassword {
    public static void main(String[] args) {
        PasswordEncoder encoderPassword = new BCryptPasswordEncoder();
        System.out.println(encoderPassword.encode("admin"));

    }
}
