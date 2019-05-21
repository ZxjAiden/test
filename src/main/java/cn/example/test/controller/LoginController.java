package cn.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojie.zhang
 */
@RestController
public class LoginController {

    @RequestMapping("/*")
    public String hello(){
        return "hello world sssss";
    }
}
