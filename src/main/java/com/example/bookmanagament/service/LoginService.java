package com.example.bookmanagament.service;

import com.example.bookmanagament.dto.Result;
import com.example.bookmanagament.pojo.Login;

public interface LoginService {

    Login getUserByID(String username);
}
