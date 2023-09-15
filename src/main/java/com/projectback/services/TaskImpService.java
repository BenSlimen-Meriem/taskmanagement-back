package com.projectback.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectback.repositories.TaskRepository;
import com.projectback.entities.Task;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class TaskImpService implements TaskService {

	private final TaskRepository taskRepository;
	
	@Override
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}
	
	
}
