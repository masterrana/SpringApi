package com.example.EmployeeManagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId ;
	
	@NotEmpty
	private String empName;
	
	
	private Long empAge;
	
	@Email
	@NotEmpty
	private  String empEmail;
	
	
	private  long empMobileNo;
	
	
	

	public Employee() {
	}

	public Employee(Long empId, @NotEmpty String empName, @NotEmpty Long empAge, @Email @NotEmpty String empEmail,
			@NotEmpty long empMobileNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEmail;
		this.empMobileNo = empMobileNo;
	}

	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empAge
	 */
	public Long getEmpAge() {
		return empAge;
	}

	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(Long empAge) {
		this.empAge = empAge;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empMobileNo
	 */
	public long getEmpMobileNo() {
		return empMobileNo;
	}

	/**
	 * @param empMobileNo the empMobileNo to set
	 */
	public void setEmpMobileNo(long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empEmail=" + empEmail
				+ ", empMobileNo=" + empMobileNo + "]";
	}
	
	
	

}
