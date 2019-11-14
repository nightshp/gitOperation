package com.example.restful.dao;


import com.example.restful.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * userdao
 */
@Mapper
public interface UserDao {
    /**
     * 插入用户信息
     *
     * @param user 用户信息
     * @return 插入成功与否
     */
    int insertUserInfo(User user);

    /**
     * 调用存储过错查询所有用户信息
     */
    User selectAll();

    /**
     * 根据id查询用户信息
     * @param uId 用户id
     * @return 用户对象信息
     */
    User selectById(Integer uId);

    /**
     * 根据id删除用户信息
     * @param uId 用户id
     * @return 删除行数
     */
    int deleteById(Integer uId);

    /**
     * 根据id更新用户信息
     * @param user 用户信息
     * @return 修改成功行数
     */
    int updateById(User user);
}
