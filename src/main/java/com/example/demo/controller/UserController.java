package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String test1(){
        return "login";
    }

    @RequestMapping("/login1")
    public String login1(User user){
        System.out.println(user);
        User user2=userService.selectByList(user);
        System.out.println(userService.getById(user));
        User user1 =userMapper.selectById(user.getUserId());
        if(user1==null){
            System.out.println("密码或用户名错误，请重新输入");
            return "usermange";
        }
        else{
            System.out.println("登录成功");
            return "login";
        }

    }
    @RequestMapping("register")
    public String register(){
        return "register";
    }

}
