package com.camundaboot.test.controllers;


import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.impl.persistence.entity.TaskEntity;
import org.camunda.bpm.engine.task.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class TestController {

    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

    @GetMapping("/currentUser")
    public String currentUser(){

        IdentityService identityService = processEngine.getIdentityService();
        return identityService.getCurrentAuthentication().getUserId();
    }


    @GetMapping("/task")
    public String task(){

        TaskService taskService = processEngine.getTaskService();
        Task task = TaskEntity.create();

        return null;
    }


}
