
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		/*DEBUG
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();*/
		
		/*WHILE
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		//executa e volta se for v, pula fora se for f;
		while(x != 0) { //!= diferente de 0
			soma += x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
 		sc.close();*/
		
		/*EXERCICIOS WHILE
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002){
			System.out.println("Senha inválida! ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!!!");
		sc.close();*/
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}