package com.database.demo;

import com.database.demo.entity.Employee;
import com.database.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringBootOracleJdbcDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOracleJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Employee> employee = employeeRepository.findAll();
		employee.forEach(System.out::println);
		//System.exit(0);
	}
}
