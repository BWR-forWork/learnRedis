package pers.bwr.learn.redis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Double score;
    private Data birthday;
}
