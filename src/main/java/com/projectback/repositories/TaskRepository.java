package com.projectback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectback.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
