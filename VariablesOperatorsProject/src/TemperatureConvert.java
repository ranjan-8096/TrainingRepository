import java.util.Scanner;

public class TemperatureConvert {

	public void convert() {
		float c, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature celsius");
		c = sc.nextFloat();
		f = (c*5/9)+32;
		System.out.println("The Temperature in fahrnheit "+ f);
	}
	
}
