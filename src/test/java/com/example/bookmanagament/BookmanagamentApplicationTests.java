package com.example.bookmanagament;

import com.example.bookmanagament.mapper.LoginDao;
import com.example.bookmanagament.pojo.Login;
import com.example.bookmanagament.service.LoginService;
import com.example.bookmanagament.utils.JWTUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static com.example.bookmanagament.utils.JWTUtil.sign;

@SpringBootTest
class BookmanagamentApplicationTests {

    @Autowired
    LoginService loginService;

    @Test
    void contextLoads() {
        Login user = loginService.getUserByID ("161110408");

        System.out.println(user.getPassword());
    }

    @Test
    void test(){

        String userid = "161110408";
        String password = "123456";

        Login user = new Login();
        user.setUserId(userid);
        user.setPassword(password);

        System.out.print(JWTUtil.sign(user));



    }


}
