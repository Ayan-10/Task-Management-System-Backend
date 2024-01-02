package com.example.tms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.tms.models.Task;

public interface TaskRepository extends CrudRepository<Task,Long> {
	

}
