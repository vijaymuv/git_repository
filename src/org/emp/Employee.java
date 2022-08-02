package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("emp name: vijay");
	}
	public static void main(String args []) {
		Employee data = new Employee();
		data.empName();
		Company name = new Company();
		name.companyName();
		Client n1 = new Client();
		n1.clientName();
		Project n2 = new Project();
		n2.projectName();
		
	}
	
}
