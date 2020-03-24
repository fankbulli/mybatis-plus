package com.zm.mybatisplus;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@Configurable
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.zm.mybatisplus.mapper",
        "com.zm.mybatisplus.service",
        "com.zm.mybatisplus.controller"
})
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}

