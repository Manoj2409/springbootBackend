package net.java.springbootBackend;

import net.java.springbootBackend.model.Employee;
import net.java.springbootBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackend implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1=new Employee();
		employee1.setFirstName("Manoj");
		employee1.setLastName("Thiyagarajan");
		employee1.setEmailId("manoj@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2=new Employee();
		employee2.setFirstName("Subash");
		employee2.setLastName("Kannan");
		employee2.setEmailId("subash@gmail.com");
		employeeRepository.save(employee2);
	}
}
