package com.projectback.services;



import com.projectback.entities.ListTask;

public interface ListTaskService {
	ListTask save (ListTask listTask);
	ListTask findById(Long id);
}
