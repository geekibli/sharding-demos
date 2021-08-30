package com.ibli.sharding.simple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author gaolei
 * @Date 2021/8/27 下午8:02
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ibli.sharding.simple")
public class SimpleBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SimpleBootstrap.class, args);
    }

}
