package com.example.generatordemo.service.imp;

import com.example.generatordemo.mapper.UserMapper;
import com.example.generatordemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int register(User user) {
        return userMapper.insert(user);
    }
}
