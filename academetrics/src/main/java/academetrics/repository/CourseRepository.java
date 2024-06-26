package academetrics.repository;

import academetrics.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    Course findByCode(String courseCode);
    void deleteByCode(String courseCode);
}
