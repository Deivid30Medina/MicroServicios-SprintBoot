package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "http://localhost:8080/api")
public interface IStudentClient {

    @GetMapping("/students/courses/{id}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long id);
}
