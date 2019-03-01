package com.example.docker.controller;

import com.example.docker.entity.User;
import com.example.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")//http://localhost:8080/User　で繋がる設定
public class UserController {
    //UserServiceをAutowiredする
    @Autowired
    UserService userService;

    //http://localhost:8080/User/All で繋がる設定
    @RequestMapping(method= RequestMethod.GET)
    public String UserselectAll(Model model){
         //検索処理
         List<User> user = userService.selectAll();
         //modelへ詰める
         model.addAttribute("user",user);
         //templates/user/index.htmlへ遷移
         return "user/index";
    }


}
