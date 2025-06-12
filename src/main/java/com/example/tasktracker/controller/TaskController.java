package com.example.tasktracker.controller;

import com.example.tasktracker.entity.Task;
import com.example.tasktracker.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tasks")
    public String getAllTasks(Model model) {
        model.addAttribute("tasks", repository.findAll());
        return "tasks";
    }

    @GetMapping("/task/{id}")
    @ResponseBody
    public Task getTaskById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/tasks/status/incomplete")
    @ResponseBody
    public List<Task> getIncompleteTasks() {
        return repository.findByCompletedFalse();
    }

    @PostMapping("/task")
    public String addTask(@ModelAttribute Task task) {
        repository.save(task);
        return "redirect:/tasks";
    }

    @PutMapping("/task/{id}")
    @ResponseBody
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return repository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDueDate(updatedTask.getDueDate());
            task.setCompleted(updatedTask.isCompleted());
            return repository.save(task);
        }).orElse(null);
    }
}

