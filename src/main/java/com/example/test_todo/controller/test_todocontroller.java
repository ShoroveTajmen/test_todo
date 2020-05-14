package com.example.test_todo.controller;

import com.example.test_todo.Service.TodoService;
import com.example.test_todo.model.Todo;
import com.example.test_todo.model.TodoDTO;
import com.example.test_todo.model.TodoForm;
import com.example.test_todo.repositories.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/test_todo")
public class test_todocontroller {
    private final TodoService todoService;
    test_todocontroller(TodoService todoService){
        this.todoService = todoService;
    }
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        String x = "Hi ";
        return x+name;

    }
    @PostMapping("")
    public String createTodo(@RequestBody TodoForm todoform) throws Exception{
        this.todoService.createTodo(todoform);
        return "OK";
    }

    @GetMapping("")
    public List<TodoDTO> getTodoList() {
        List<TodoDTO> res = this.todoService.getTodoList();
        return res;
    }
}
