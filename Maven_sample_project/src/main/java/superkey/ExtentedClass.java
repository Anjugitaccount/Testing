package superkey;

public class ExtentedClass extends Superkeyword {
int d=10,e=5,f;
	public void sub() {
		super.add();
		f=d-e;
		System.out.println(f);
		System.out.println("Parent class variable"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentedClass object=new ExtentedClass();
		//object.add();
		object.sub();
		

	}

}
