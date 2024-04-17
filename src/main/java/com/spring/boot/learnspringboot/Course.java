package com.spring.boot.learnspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String courseName;
    private String author ;


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
