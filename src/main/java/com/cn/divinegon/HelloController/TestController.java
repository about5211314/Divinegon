package com.cn.divinegon.HelloController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @沈立
 * @create: 2019-09-12-下午 16:46
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    public void test(){
        int a = 0;
        int b = 1;
        String abc = "test";
        abc = abd + "-1";
    }
}
