package com.example.taskmanager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public TaskEntity createTask(String title){
    TaskEntity taskEntity=new TaskEntity();
    taskEntity.setTitle(title);
    taskEntity.setCompleted(false);

    return this.taskRepository.save(taskEntity);
    }
}
