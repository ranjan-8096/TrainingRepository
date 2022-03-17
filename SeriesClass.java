import java.util.Scanner;

public class SeriesClass {
	
	public static void generateSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for the series");
		int i = 1;
		int n = sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public static void generateEvennumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enters number for the series");
		int i = 1;
		int n = sc.nextInt();
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void countPositiveNegitive( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr 10 numbers");
		int num=0;
		int i=1;
		int countpositive =0;
		int countnegitive =0;
		 while(i<=10) {
			 num =sc.nextInt();
			 if(num>0) {
				 countpositive++;
			 }
			 else {
				 countnegitive++;
			 }
			 i++;
		 }
		 System.out.println(countpositive);
		 System.out.println(countnegitive);
	}

}
