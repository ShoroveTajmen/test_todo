package com.example.test_todo.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date deadline;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private Date createAt;

    @Column(nullable = false)
    private Date updateAt;


}
