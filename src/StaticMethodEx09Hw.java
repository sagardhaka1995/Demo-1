class AY{
	static int x;
	static void m() {
		x++;
	}
	static void show() {
		System.out.println(x);
	}
}
public class StaticMethodEx09Hw {

	public static void main(String[] args) {
		System.out.println(AY.x);
         AY.m();
         AY.m();
         AY.show();
	}

}
