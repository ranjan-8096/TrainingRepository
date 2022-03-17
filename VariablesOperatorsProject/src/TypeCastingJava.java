import java.util.Scanner;


public class TypeCastingJava {

	public static String intintostring(int num1) {
		String str =String.valueOf(num1);
		return str;
	}	
	
	public static int Stringintoint(String str) {
		int c = Integer.parseInt(str);
		return c;
	}
	public static int count;
	
	public int thing() {
		int count = 5;
		++count;
		return (count);
	}
	
	public static void main(String[] args) {
		String v = intintostring(55);
		System.out.println(v);
		System.out.println(Stringintoint("44"));
		TypeCastingJava c = new TypeCastingJava();
		int var = c.thing();
		int vab = c.thing();
		int vac = c.thing();
		System.out.println(var);
		System.out.println(vab);
		System.out.println(vac);
	}
	
	
	}

