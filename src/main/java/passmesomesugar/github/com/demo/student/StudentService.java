package passmesomesugar.github.com.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Mariam",
                        "mary@hotbox.net",
                        LocalDate.of(1999,
                                Month.APRIL, 23),
                        22));
    }
}
