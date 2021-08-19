package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //User user=userMapper.selectById(1l);
        //System.out.println(user);
        System.out.println(userMapper.selectById(1));
//        User user=new User();
//        user.setUser_id(2l);
//        user.setCreate_time(null);
//        user.setPassword_md5("1111");
//        userMapper.insert(user);
    }

}
