package com.example.EmployeeManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository EmployeeRepo;
	
	// Select All  Employee 
	@GetMapping("/selectEmpAll")
	public List<Employee> getAllEmployeeList() {
		return EmployeeRepo.findAll();
	}
	// Select one  Employee 
	@GetMapping("/selectEmpOne/{id}")
	public Optional<Employee> getAllEmployeeOne(@PathVariable Long id) {
		return EmployeeRepo.findById(id);
	}
	
	
	// Delete one  Employee 
		@DeleteMapping("/DeleteEmpOne/{id}")
		public String reomveAllEmployeeOne(@PathVariable Long id) {
			 EmployeeRepo.deleteById(id);
			return "Delete Sucessfully";
		}
		
	
	// Insert  Employee Data 
	@PostMapping("/inertEmpData")
	public String InsertEmpData(@RequestBody Employee e)
	{
		EmployeeRepo.save(e);
		return "Inseted Sucessfully";
		
	}
	
	// Insert  Employee Data 
	@PutMapping("/updateEmpData/{id}")
	public String updateEmpData(@RequestBody Employee e,@PathVariable Long id)
	{
		Employee emp1 = new Employee();
		emp1.setEmpId(id);
		emp1.setEmpName(e.getEmpName());
		emp1.setEmpAge(e.getEmpAge());
		emp1.setEmpMobileNo(e.getEmpMobileNo());
		emp1.setEmpEmail(e.getEmpEmail());
		EmployeeRepo.save(emp1);
		return "Updated Sucessfully";
		
	}
	

}
