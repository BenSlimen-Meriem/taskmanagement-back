package com.projectback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectback.entities.Task;
import com.projectback.services.TaskService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/task")

public class TaskController {
	@Autowired
	private TaskService taskService;
	
	
	@PostMapping("/create")
    public Task createTask(@RequestBody Task task) {

	  return taskService.save(task);
    }
}
