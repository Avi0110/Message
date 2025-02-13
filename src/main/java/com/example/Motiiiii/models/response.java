package com.example.Motiiiii.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "responses")
public class response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String choice;
    private LocalDateTime timestamp = LocalDateTime.now();

    public response() {}

    public response(String choice) {
        this.choice = choice;
    }

    public Long getId() {
        return id;
    }

    public String getChoice() {
        return choice;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
