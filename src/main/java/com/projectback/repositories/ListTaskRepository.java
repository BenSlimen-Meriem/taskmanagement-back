package com.projectback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectback.entities.ListTask;

public interface ListTaskRepository extends JpaRepository<ListTask, Long> {
	
}
