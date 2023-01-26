package perscholas.sba1.assignment303;

import java.util.ArrayList;

public class Employee {
	static  int n = 8;
	//fields
	String firstName,lastName,department;

	//constructor
	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	 
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	//methods
	@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
		}
	
	public static ArrayList<Employee> addEmployes (String[] firstName,String[] lastName,String[] department){
		   ArrayList<Employee> employees = new ArrayList<Employee>();
		   for (int i= 0; i < n ;i++) {
			   employees.add(new Employee(firstName[i], lastName[i], department[i]));   
		   }
	       for(int i =0; i < n; i++) {
	    	   Employee emp = employees.get(i);
	    	   System.out.println(emp.firstName + " " + emp.lastName + " " + emp.department);
	       }
	
		   return employees ;
	}
	 


    public static void main(String[] args) {
    	String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
    	 
    	String[] lastName = {"Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr"};
    	 
    	String[] department = {"production", "r&d", "sales", "marketing", "human resources", "accounting", "sales", "r&d"};

    	System.out.println("Employee details are: ");
    	Employee.addEmployes(firstName, lastName, department);
    	
    }
    }