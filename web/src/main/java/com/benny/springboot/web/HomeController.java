package com.benny.springboot.web;

import com.benny.springboot.domain.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping("/index")
    public UserBean index(){

        UserBean userBean = new UserBean();
        userBean.setName("姓名1asdfasfd1");
        userBean.setAge(18);

        return userBean;
    }
}
