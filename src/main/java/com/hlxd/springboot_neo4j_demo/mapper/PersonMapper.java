package com.hlxd.springboot_neo4j_demo.mapper;

import com.hlxd.springboot_neo4j_demo.entity.Person;

import java.util.List;

/**
 * @program: springboot-neo4j-demo
 * @ClassName PersonMapper
 * @description:
 * @author: WYF
 * @create: 2021-04-21
 * @Version 1.0
 **/
public interface PersonMapper {
    List<Person> getAll();


}
