import java.util.Scanner;

public class TestVariablesOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2, sum;
		System.out.print("Enter Two Numbers");
		
		//creating an object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//userdefined input
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The sum of"+num1+"+"+num2+"="+sum);
		
		//direct assignment
		int a = 2;
		int b = 3;
		System.out.println(a+b);
		
		
		TemperatureConvert tc = new TemperatureConvert();
		tc.convert();
		
		String v = TypeCastingJava.intintostring(55);
		System.out.println(v);
		
		System.out.print("table");
	}

}
