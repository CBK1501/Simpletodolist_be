package com.example.Simpletodolist.controller;

import com.example.Simpletodolist.dto.TaskRequestDTO;
import com.example.Simpletodolist.dto.TaskResponseDTO;
import com.example.Simpletodolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    public ResponseEntity<String> addTask(@RequestBody TaskRequestDTO taskRequestDTO) {
        return ResponseEntity.ok(taskService.addTask(taskRequestDTO));
    }

    @GetMapping("/task")
    public ResponseEntity<TaskResponseDTO> getTask(@RequestParam String id) {
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @GetMapping("tasks")
    public ResponseEntity<List<TaskResponseDTO>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PutMapping("/task")
    public ResponseEntity<String> updateTask( @RequestBody TaskRequestDTO taskRequestDTO) {
        return ResponseEntity.ok(taskService.updateTask(taskRequestDTO));
    }

    @DeleteMapping("/task")
    public ResponseEntity<String> deleteTask(@RequestParam String id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }
}
