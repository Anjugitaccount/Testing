package Polymorphism;

public class Child_class extends Parent_class{
public void print() {
	
	//super.print(); calling parent method using super keyword
	System.out.println("Child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_class object=new Child_class();
		object.print();
		//object.print();
		Parent_class object1=new Parent_class();
		object1.print();
	}

}
