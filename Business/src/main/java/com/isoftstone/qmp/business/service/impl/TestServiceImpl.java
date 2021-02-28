package com.isoftstone.qmp.business.service.impl;

import com.isoftstone.qmp.business.dao.UserMapper;
import com.isoftstone.qmp.business.entity.User;
import com.isoftstone.qmp.business.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAll();
    }
}
