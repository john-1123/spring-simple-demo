package com.example.simplecruddemo.repository;

import com.example.simplecruddemo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
