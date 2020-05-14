package com.example.test_todo.Service;
import com.example.test_todo.model.TodoDTO;
import com.example.test_todo.model.TodoForm;

import java.util.List;

public interface TodoService {
    void createTodo(TodoForm todoForm) throws Exception;

    List<TodoDTO> getTodoList();

}
