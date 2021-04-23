package com.hlxd.springboot_neo4j_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-neo4j-demo
 * @ClassName 启动类
 * @description:
 * @author: WYF
 * @create: 2021-04-21
 * @Version 1.0
 * */
@MapperScan("com.hlxd.springboot_neo4j_demo.mapper")
@SpringBootApplication
public class SpringbootNeo4jDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNeo4jDemoApplication.class, args);
    }

}
