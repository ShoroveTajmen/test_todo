package com.example.test_todo.repositories;

import com.example.test_todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
