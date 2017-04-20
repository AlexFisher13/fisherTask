package com.example.repository;

import com.example.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Михан on 20.04.2017.
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

    List<Task> findByName(String name);


}
