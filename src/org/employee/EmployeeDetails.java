package org.employee;

//            class
public class EmployeeDetails {
	
	//           method 1
	private void employeeName() {
		
		System.out.println("Employee Name : Anand");
	}
	
	//            method 2
	private void employeeMobile() {
		
		System.out.println("Employee Mobile : 8939278836");
	}
	
	private void empDetail() {
		System.out.println("Employee : Siva");
	}
	//               main method
	public static void main(String[] args) {
		
		//             obj
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.employeeName();
		e.employeeMobile();
		
	}

}
