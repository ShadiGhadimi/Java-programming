package com.spring.boot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> listOfCourses() {
        return Arrays.asList(
                new Course(1, "Spring boot", "shadi"),
                new Course(1, "Spring boot", "shadi")
        );
    }
}
