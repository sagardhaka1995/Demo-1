class AS{
	static int x;
	int y;
	void m(int a) {
		y=a;
	}
}
public class StaticMethodEx1Hw {

	public static void main(String[] args) {
		
        System.out.println(AS.x);
        AS a=new AS();
        a.m(4);
        a.x=3;
        System.out.println(AS.x);
        System.out.println(a.y);
        System.out.println(a.x);
	}

}
