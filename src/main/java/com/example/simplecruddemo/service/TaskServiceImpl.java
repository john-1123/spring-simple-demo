package com.example.simplecruddemo.service;

import com.example.simplecruddemo.model.Task;
import com.example.simplecruddemo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("taskService")
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "taskSeq"));
    }

    @Override
    public void removeTask(int taskSeq) {
        taskRepository.deleteById(taskSeq);
    }
}
