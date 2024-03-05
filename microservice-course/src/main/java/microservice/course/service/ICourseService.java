package microservice.course.service;



import microservice.course.entities.Course;
import microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);


    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
