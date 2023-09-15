package com.projectback.services;

import org.springframework.stereotype.Service;


import com.projectback.repositories.ListTaskRepository;

import jakarta.persistence.EntityNotFoundException;

import com.projectback.entities.ListTask;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ListTaskImpService implements ListTaskService {

	private final ListTaskRepository listTaskRepository;
	
	

	@Override
	public ListTask save (ListTask listTask) {
		
		return listTaskRepository.save(listTask);
		
	}
	
	@Override
	public ListTask findById(Long id) {
		// TODO Auto-generated method stub
		return listTaskRepository.findById(id).orElse(null);
	}

}