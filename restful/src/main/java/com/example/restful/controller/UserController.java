package com.example.restful.controller;


import com.example.restful.bean.User;
import com.example.restful.response.UserResponse;
import com.example.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CONTROLLER层
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     *
     * @param user 用户信息
     * @return 操作信息
     */
    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    @ResponseBody
    public UserResponse register(@RequestBody User user) {
        return userService.insertUserInfo(user);
    }

    /**
     * 查询用户所有信息
     */
    @RequestMapping(value = "/user/selectAll",method = RequestMethod.GET)
    public User selectAll() {
        System.out.printf("000");
        return userService.selectAll();
    }


    /**
     * 根据id查询用户
     * @param uId 用户id
     * @return 用户信息
     */
    @RequestMapping(value = "/user/{uId}",method = RequestMethod.GET)
    public User selectById(@PathVariable Integer uId){
        return userService.selectById(uId);
    }

    /**
     * 根据id删除用户
     * @param uId 用户ID
     * @return 删除行数
     */
    @RequestMapping(value = "/user/{uId}",method = RequestMethod.DELETE)
    public int deleteById(@PathVariable Integer uId){
        return userService.deleteById(uId);
    }

    /**
     * 根据id修改用户
     * @param uId 用户ID
     * @return 修改成功行数
     */
    @RequestMapping(value = "/user/{uId}",method = RequestMethod.PUT)
    public int updateById(@PathVariable Integer uId,@RequestBody User user){
        return userService.updateById(uId,user);
    }
}
