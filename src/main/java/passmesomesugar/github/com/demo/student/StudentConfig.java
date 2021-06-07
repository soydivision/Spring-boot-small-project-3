package passmesomesugar.github.com.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student aru =
                    new Student(
                            1L, "Aruzhan", "arushka@hotmail.net",
                            LocalDate.of(2000, APRIL, 14)
                    );
            Student alex =
                    new Student(
                            "Alex", "alexdarkstalker22@mail.com",
                            LocalDate.of(1998, JANUARY, 18)
                    );
            repository.saveAll(List.of(aru, alex));
        };
    }
}
