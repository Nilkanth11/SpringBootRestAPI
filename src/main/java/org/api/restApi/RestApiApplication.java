package org.api.restApi;

import org.api.restApi.model.Employee;
import org.api.restApi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Karan");
		employee.setLastName("Jadeja");
		employee.setEmailId("kj@gmail.com");
		employeeRepository.save(employee);

	}
}
