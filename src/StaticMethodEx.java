class Emp{
	String name ;
	int salary;
	 static String cname ="ABC";
	 void input (String n,int s) {
		 name =n;
		 salary=s;
	 }
	 void show () {
		 System.out.println(name +" "+salary+" "+" "+cname);
	 }
	static  void Display () {
		 System.out.println("HI Employee");
		
	 }
}
public class StaticMethodEx {

	public static void main(String[] args) {
       Emp.Display();
       Emp.cname ="XYZ";
		Emp a =new Emp();
		Emp b =new Emp();
		Emp c =new Emp();
		Emp d =new Emp();
		
		a.input("sagar", 10000);
		b.input("mantu", 15000);
		c.input("captin", 20000);
		d.input("sandeep", 50000);
		
		Emp.Display();
		a.Display();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		Emp.Display();
		
	}

}
