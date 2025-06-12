package com.example.tasktracker;

import com.example.tasktracker.entity.Task;
import com.example.tasktracker.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TaskTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(TaskRepository repo) {
        return args -> {
            repo.save(new Task(null, "Complete Spring Boot project", LocalDate.of(2025, 6, 15), false));
            repo.save(new Task(null, "Submit assignment", LocalDate.of(2025, 6, 14), true));
            repo.save(new Task(null, "Prepare for meeting", LocalDate.of(2025, 6, 18), false));
        };
    }
}
