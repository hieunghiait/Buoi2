package vominhthuan.spring.crudwiththymeleaf.repository;

import vominhthuan.spring.crudwiththymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
