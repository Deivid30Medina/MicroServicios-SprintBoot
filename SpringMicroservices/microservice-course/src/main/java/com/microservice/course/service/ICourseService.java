package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudenByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudenByCourseResponse findStudensByIdCourse(Long idCourse);
}
