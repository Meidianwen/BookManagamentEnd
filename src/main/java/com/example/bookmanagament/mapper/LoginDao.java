package com.example.bookmanagament.mapper;

import com.example.bookmanagament.pojo.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {

    Login getUserByUsername(String username);

}
