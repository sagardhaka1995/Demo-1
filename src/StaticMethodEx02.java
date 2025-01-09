class AA{
	int x=10;
	static String y;
	void show() {
		System.out.println(x+y);
	}
}
public class StaticMethodEx02 {

	public static void main(String[] args) {
      AA a1=new AA();
      AA a2=new AA();
      a1.x=40;
      a2.y="yoyo";
      a1.y="abc";
      a1.show();
      a2.show();
      
	}

}
