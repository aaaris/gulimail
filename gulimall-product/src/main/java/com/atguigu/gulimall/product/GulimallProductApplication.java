package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1、整合mybatis-Plus
 * (1)导入依赖
 * (2)配置
 */

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
