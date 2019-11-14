package com.example.restful.service.impl;


import com.example.restful.bean.User;
import com.example.restful.dao.UserDao;
import com.example.restful.response.UserResponse;
import com.example.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * userService的实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserResponse insertUserInfo(User user) {
        UserResponse userResponse = new UserResponse();
        if (userDao.insertUserInfo(user) > 0) {
            userResponse.setMessage("插入成功");
            return userResponse;
        }
        return userResponse;
    }

    @Override
    public User selectAll() {
        User user = userDao.selectAll();
        return user;
    }

    @Override
    public User selectById(Integer uId) {
        return userDao.selectById(uId);
    }

    @Override
    public int deleteById(Integer uId) {
        return userDao.deleteById(uId);
    }

    @Override
    public int updateById(Integer uId,User user) {
        user.setuId(uId);
        return userDao.updateById(user);
    }

}
