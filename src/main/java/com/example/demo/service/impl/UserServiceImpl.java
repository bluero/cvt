package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
@Autowired
private UserMapper userMapper;

    public User selectByList(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("nick_name",user.getNickName());
        User user1=userMapper.selectOne(wrapper);
        return user1;
    }
}
