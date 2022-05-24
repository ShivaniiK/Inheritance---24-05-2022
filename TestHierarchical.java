package com;                //HierarchicalInheritance

public class TestHierarchical {

	public static void main(String[] args) {
	
		PermanentEmployee objPermanentEmployee = new PermanentEmployee();
		ContractEmployee objContractEmployee = new ContractEmployee();
		
		System.out.println("Salary of Permanent Employee is: ");
		objPermanentEmployee.displaySalary();
		
		System.out.println("Salary of Contract Employee is: ");
		objContractEmployee.displaySalary();
		
		objPermanentEmployee.increment();
		objContractEmployee.salaryIncrement();
		System.out.println("Salary of Permanent employee after increment:");
		objPermanentEmployee.displaySalary();
		
		System.out.println("Salary of Contract employee after increment:");
		objContractEmployee.displaySalary(); 
		
	}
}

