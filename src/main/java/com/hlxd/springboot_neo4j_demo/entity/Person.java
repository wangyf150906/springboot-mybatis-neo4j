package com.hlxd.springboot_neo4j_demo.entity;

import java.io.Serializable;

/**
 * @program: springboot-neo4j-demo
 * @ClassName Person
 * @description: 人员实体类
 * @author: WYF
 * @create: 2021-04-21
 * @Version 1.0
 **/
public class Person implements Serializable {
    private Integer id;
    private String image;
    private String name;

    public Person() {
    }

    public Person(Integer id, String image, String name) {
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
