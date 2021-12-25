package com.example.simplecruddemo.service;

import com.example.simplecruddemo.model.Task;

import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    List<Task> getTasks();
    void removeTask(int taskSeq);
}
