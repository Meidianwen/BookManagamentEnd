package com.example.bookmanagament.controller;

import com.example.bookmanagament.dto.Result;
import com.example.bookmanagament.pojo.Login;
import com.example.bookmanagament.service.LoginService;
import com.example.bookmanagament.utils.JWTUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody Map<String, Object> map) {

        String username = (String) map.get("username");
        String password = (String) map.get("password");
        Login userLogin = loginService.getUserByID(username);

        if (userLogin == null || !userLogin.getPassword().equals(password)) {
            return Result.fail("用户名或密码错误");
        }
        HashMap<Object, Object> data = new HashMap<>();
        data.put("token",JWTUtil.sign(userLogin));
        data.put("user", userLogin);

        return Result.success(data);
    }

    @GetMapping("/login2")
    public Result login2(){

        return Result.fail("sdsd");
    }



}

