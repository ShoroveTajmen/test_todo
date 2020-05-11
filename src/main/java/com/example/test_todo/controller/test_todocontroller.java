package com.example.test_todo.controller;

import com.example.test_todo.model.Todo;
import com.example.test_todo.model.TodoForm;
import com.example.test_todo.repositories.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/test_todo")
public class test_todocontroller {
    private final TodoRepository todoRepository;

    test_todocontroller(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        String x = "Hi ";
        return x+name;

    }
    @PostMapping("")
    public int createTodo(@RequestBody TodoForm todoform) throws Exception{
        Todo todo = new Todo();

        todo.setName(todoform.getName());
        todo.setStatus(todoform.isStatus());

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date deadline = format.parse(todoform.getDeadline());
        todo.setDeadline(deadline);

        todo.setCreateAt(new Date());
        todo.setUpdateAt(new Date());

        todoRepository.save(todo);
        return 10;
    }
}
