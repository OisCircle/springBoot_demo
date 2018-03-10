package com.qcq.springBoot_demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qcq.springBoot_demo.entity.User;
import com.qcq.springBoot_demo.mapper.UserMapper;

@Service
public class UserService {
	@Resource
	UserMapper tm;
	public User selectOne(){
		return tm.selectOne();
	}
}
