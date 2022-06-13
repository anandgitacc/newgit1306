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
	private void empAdd() {
		System.out.println("OMR-Chennai");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 6a4ffc45dd5a5c90b704c6523dd493679249b846
	
	//               main method
	public static void main(String[] args) {
		
		//             obj
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.employeeName();
		e.employeeMobile();
		
	}

}
