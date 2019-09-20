package com.cn.divinegon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.cuit.springboot.gdao")
public class DivinegonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DivinegonApplication.class, args);
    }

}
