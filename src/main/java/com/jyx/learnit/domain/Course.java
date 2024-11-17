package com.jyx.learnit.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "t_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String category;
    private LocalDate startsOn;
    private LocalDate endsOn;

    public Course() {
    }

    public Course(String title, String description, String category, LocalDate startsOn, LocalDate endsOn) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.startsOn = startsOn;
        this.endsOn = endsOn;
    }
}
