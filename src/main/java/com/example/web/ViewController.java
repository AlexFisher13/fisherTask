package com.example.web;

import com.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Михан on 20.04.2017.
 */
@Controller
@RequestMapping("/view")
public class ViewController {


    @Autowired
    TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allTasks() {

        ModelAndView allTasks = new ModelAndView("all_tasks");
        allTasks.addObject("task", taskService.findByName("1").get(0));
        return allTasks;

    }

}
