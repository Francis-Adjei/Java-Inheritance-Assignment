class Member{
	
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	void printSalary(){
		System.out.println(salary);
	}}
	
class Employee extends Member{
	
	String specialization;
	
}

class Manager extends Member{
	
	String department;
	
}

public class Q2 {
	
	  public static void main(String[] args){
		   
		  Employee mark = new Employee();
		    mark.name = "Mark";
		    mark.age = 54;
		    mark.phoneNumber = "0504635821";
		    mark.address = "Kumasi";
		    mark.salary = 854;
		    mark.specialization = "Networking";

		    Manager francis = new Manager();
		    francis.name = "Francis";
		    francis.age = 25;
		    francis.phoneNumber = "0240887766";
		    francis.address = "Accra";
		    francis.salary = 4875;
		    francis.department = "Computer science";
		   
		    mark.printSalary();
		    francis.printSalary();

}

}
