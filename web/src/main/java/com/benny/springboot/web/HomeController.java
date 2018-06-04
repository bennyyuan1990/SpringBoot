package com.benny.springboot.web;

import com.benny.springboot.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    UserBean userBean;

    @GetMapping("/index")
    public UserBean index() {
        return userBean;
    }


    @PostMapping("post")
    public UserBean post(@RequestBody UserBean userBean) {

        return userBean;
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("运行期异常");
    }
}
