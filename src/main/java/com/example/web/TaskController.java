package com.example.web;

import com.example.model.Task;
import com.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by Михан on 20.04.2017.
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Task> findAll() {
        return taskService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public Task save(@RequestParam String name) {
        Task task = new Task();
        task.setName(name);
        return taskService.saveTask(task);
    }


    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<Task> findByName(@PathVariable String name) {
        return taskService.findByName(name);
    }
}
