package com.cyf.project01.controller;


import com.cyf.project01.domain.User;
import com.cyf.project01.service.UserService;
import com.cyf.project01.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("list")
    public JsonData list(){
        return JsonData.buildSuccess(userService.list());
    }

    @PostMapping("save")
    public JsonData save(@Validated @RequestBody User user){
        userService.save(user);
        return JsonData.buildSuccess("注册用户成功");
    }

    @GetMapping("delete")
    public JsonData delete(Integer id){
        if(id==null){
            return JsonData.buildError("请输入要删除的用户id");
        }else {
            userService.delete(id);
            return JsonData.buildSuccess("删除成功");
        }
    }

    @PostMapping("update")
    public JsonData update(@RequestBody User user){
        userService.update(user);
        return JsonData.buildSuccess("修改用户成功");
    }

}
