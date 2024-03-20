package assignment4;

public class Employee {
	public void EmpDetails(String name, double sal) 
	{
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
	}
	public void EmpDetails(String Company, int EmpId) 
	{
		System.out.println("Company: " + Company);
		System.out.println("EmpId: " + EmpId );
	}
	public static void main(String[] args)
	{
		Employee Emp = new Employee();
		Emp.EmpDetails("Tushar", 600000);
		Emp.EmpDetails("TCS", 37);
		
				
	}

}