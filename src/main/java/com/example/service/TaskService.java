package com.example.service;

import com.example.model.Task;
import com.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Михан on 20.04.2017.
 */
@Service
public class TaskService {

    final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task saveTask(Task task) {
        if(StringUtils.isEmpty(task.getName())) {
            throw new IllegalArgumentException(task.toString());
        }

        return taskRepository.save(task);
    }


    public List<Task> findAll() {
        List<Task> result = new ArrayList<>();

        Iterable<Task> all = taskRepository.findAll();
        all.forEach(result::add);
        return result;
    }

    public List<Task> findByName(String name) {

        return taskRepository.findByName(name);
    }
}
