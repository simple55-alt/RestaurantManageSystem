package com.itcast.service.impl;

import java.util.List;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import com.itcast.pojo.UserExample;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserMapper userMapper;


	@Override
	public int countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserExample example) {
		return userMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer uId) {
		return userMapper.deleteByPrimaryKey(uId);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	@Override
	public User selectByPrimaryKey(Integer uId) {
		return userMapper.selectByPrimaryKey(uId);
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		return userMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		return userMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
}
