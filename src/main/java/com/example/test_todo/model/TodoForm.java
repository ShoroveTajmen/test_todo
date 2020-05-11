package com.example.test_todo.model;

import lombok.Data;
import java.util.Date;

@Data
public class TodoForm {
    private String name;
    private String deadline;
    private boolean status;
}
