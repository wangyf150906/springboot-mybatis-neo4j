package com.hlxd.springboot_neo4j_demo.controller;

import com.hlxd.springboot_neo4j_demo.entity.Person;
import com.hlxd.springboot_neo4j_demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-neo4j-demo
 * @ClassName PersonController
 * @description: person控制器类
 * @author: WYF
 * @create: 2021-04-21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @GetMapping("/getAll")
    public List<Person> getAll(){
        List<Person> all = personMapper.getAll();
        return all;
    }
}
