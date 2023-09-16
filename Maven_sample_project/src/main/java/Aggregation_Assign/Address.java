package Aggregation_Assign;

public class Address {
String address; Student stud;
public Address(String address,Student stud) {
	this.address=address;
	this.stud=stud;
}
public void print() {
	System.out.println("Student Name="+stud.name);
	System.out.println("Rollnumber="+stud.rollno);
	System.out.println("Address="+address);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student(10,"Anju");
Address adder=new Address("Kollam",student);
adder.print();
	}

}
