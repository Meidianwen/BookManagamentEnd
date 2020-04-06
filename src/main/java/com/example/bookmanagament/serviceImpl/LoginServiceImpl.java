package com.example.bookmanagament.serviceImpl;

import com.example.bookmanagament.mapper.LoginDao;
import com.example.bookmanagament.pojo.Login;
import com.example.bookmanagament.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Login getUserByID(String username) {

        return loginDao.getUserByUsername(username);

    }
}
