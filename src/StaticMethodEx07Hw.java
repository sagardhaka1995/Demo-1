class AZ{
	static int x;
	void m() {
		x++;
		System.out.println(x);
	}
	static void setX(int a) {
		x=a;
		
	}
	
}
public class StaticMethodEx07Hw {

	public static void main(String[] args) {
	        AZ a =new AZ();
	        System.out.println(a.x);
	        a.m();
	        AZ.setX(15);
	        a.m();
	        

	}

}
