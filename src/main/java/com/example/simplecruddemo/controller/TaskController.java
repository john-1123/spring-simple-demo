package com.example.simplecruddemo.controller;

import com.example.simplecruddemo.model.Task;
import com.example.simplecruddemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/list")
    public String listTasks(Model model) {
        model.addAttribute("taskList", this.taskService.getTasks());
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addTask(@ModelAttribute("task") Task task) {
        this.taskService.addTask(task);
        return "redirect:/task/list";
    }

    @RequestMapping("/remove/{id}")
    public String removeTask(@PathVariable("id") int id) {
        this.taskService.removeTask(id);
        return "redirect:/task/list";
    }
}
