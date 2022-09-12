import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFor {
	public static void main (String[] args ) {
		/*Exercicios FOR
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in = in +1;
			}else {
				out = out +1 ;
			}
		}
		System.out.println(in + "in");
		System.out.println(out + "out");
		
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
				
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0)/10.0;
			
			System.out.printf("%.1f%n", media);
			sc.close();
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 
		 int n = sc.nextInt();
		 
		 for(int i = 0; i < n; i++) {
			 
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 
			 n = a / b;
			 if(n > 0) {
				 System.out.print("Valor: " + n);
			 }else {
				 System.out.println("Divisao impossivel");
			 }
		 }
		 sc.close();*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
		
}

