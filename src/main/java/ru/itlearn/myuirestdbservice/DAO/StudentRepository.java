package ru.itlearn.myuirestdbservice.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itlearn.myuirestdbservice.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {




}
