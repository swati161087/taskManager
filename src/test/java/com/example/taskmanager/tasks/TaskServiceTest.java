package com.example.taskmanager.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class TaskServiceTest {
    private final TaskRepository taskRepository;
    @Autowired
    public TaskServiceTest(TaskRepository taskRepository){
        this.taskRepository=taskRepository;

    }

    // in datajpa test we can not autowire service we can only autowire repositories
    @Test
    public void testCreateTask(){
        TaskService taskService=new TaskService(taskRepository);
        TaskEntity task=taskService.createTask("new task");
        System.out.println(task);
    }
}
