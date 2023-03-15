import org.springframework.data.jpa.repository.JpaRepository;
import com.example.transactionmanagement.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
