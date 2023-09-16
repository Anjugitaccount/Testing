package Has_a;

public class Aggrigation2 {
	int b;Aggrigation n;
public Aggrigation2(int b,Aggrigation n) {
	this.b=b;
	this.n=n;
}
public void print() {
	System.out.println(b);
	System.out.println(n.a);
	System.out.println(n.name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggrigation parent=new Aggrigation(10,"Anju");
		Aggrigation2 child=new Aggrigation2(20,parent);
		child.print();
	}

}
