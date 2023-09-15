package com.projectback.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projectback.entities.ListTask;
import com.projectback.services.ListTaskService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/list")

public class ListTaskController {
	
	@Autowired
	private ListTaskService listTaskService;
	
	@PostMapping("/create")
    public ListTask create(@RequestBody ListTask listTask) {

	  return listTaskService.save(listTask);
    }


    @GetMapping("/findById/{id}")
    public ListTask findById(@PathVariable Long id) {
        return listTaskService.findById(id);
    }
}
