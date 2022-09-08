import java.util.Locale;
import java.util.Scanner;

public class ExerciciosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*>>>>>>EXERCICIO 01, o usuário informa às horas atuais e o sistema informa se bom dia, boa tarde ou boa noite!
		 
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 int hora;
		
		 System.out.print("Quantas horas? "); 	
		
		 hora = sc.nextInt();
		 
		 if(hora < 12) {
			 System.out.println("bom dia"); 
		 } else if ( hora < 18) { 
			 System.out.println("boa tarde"); 
		 } 
		 else {
		 System.out.println("boa noite"); 
		 } 
		 
		 sc.close();
		 */
		
		/*>>>>>>EXERCICIO 2 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int number;
		 
		System.out.print("Digite o numero : "); 
		number = sc.nextInt();
		  
		if(number < 0) { 
			System.out.println("Numero negativo!"); 
		} else {
			System.out.println("Numero positivo!"); 
		}
		
		sc.close();
		*/
		
		
		 /*>>>>>>EXERCICIO 3
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 int number;
		  
		 System.out.print("Digite o numero : "); 
		 number = sc.nextInt();
		  
		 if(number % 2 == 0) { 
			 System.out.println("PAR"); 
		 }else {
		 	System.out.println("IMPAR"); 
		 }
		 sc.close();
		 */
		 

		
		 /*>>>>>>EXERCICIO 3
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 int a, b;
		  
		 System.out.print("Digite o valor de a: "); 
		 a = sc.nextInt();
		 System.out.print("Digite o valor de b: "); 
		 b = sc.nextInt();
		 
		 if(a % b == 0 || b % a == 0) { 
		  System.out.println("Sao multiplos"); 
		 }else {
		  System.out.println("Nao sao multiplos"); 
		 }
		 
		 sc.close();
		 /

		/*>>>>>>EXERCICIO 4 
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 
		 int hrInicial, hrFinal, duracao;
	
		 System.out.print("Digite a hora inicial: "); 
		 hrInicial = sc.nextInt();
		 System.out.print("Digite a hora final: ");
		 hrFinal = sc.nextInt();
		 
		 if(hrInicial < hrFinal) { 
		 	duracao = hrFinal - hrInicial; 
		 }else { 
		 	duracao = 24 - hrInicial + hrFinal; 
		 }
		  
		 System.out.println("O jogo durou " + duracao + "Horas!");
		 
		 sc.close();
		 */
		
		/*>>>>>>EXERCICIO 5
		 
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
			  
		 int codigo; 
		 int quantidade; 
		 double total = 0;
			  
		 System.out.print("Digite o codigo do produto: "); 
		 codigo = sc.nextInt();
		 System.out.print("Digite a quantidade do produto: "); 
		 quantidade = sc.nextInt();
			 
		 if(codigo == 1) { 
		  	total = quantidade * 4.00; 
		 }else if (codigo == 2){
		   	total = quantidade * 4.50; 
		 }else if(codigo == 3){ 
			  total = quantidade * 5.00; 
		 }else if(codigo == 4){ 
			  total = quantidade * 2.00; 
		 }else if(codigo == 5 ){ 
			total = quantidade * 1.50; 
		 }else {
			System.out.println("Codigo inserido foi inválido!!");
		 }
			 
		 System.out.printf("Total a pagar: R$%.2f", total);
			  
		 sc.close();
		 */
		
			
		/*>>>>>>EXERCICIO 6 
		 
		  Scanner sc = new Scanner(System.in);
		  Locale.setDefault(Locale.US);
		  
		  System.out.print("Digite o valor: "); 
		  double valor; 
		  valor = sc.nextDouble();
			 
			 
		  if(valor >=0 && valor <= 25 ) {
			 System.out.printf("O valor se encontra no intervalo de: 0 e 25", valor);
		  }else if(valor>=25 && valor <=50) {
			 System.out.printf("O valor se encontra no intervalo de: 25 e 50", valor);
		  }else if(valor >50 && valor <=75) {
			 System.out.printf("O valor se encontra no intervalo de: 51 e 75", valor);
		  }else if(valor > 75 && valor <=100) {
			 System.out.printf("O valor se encontra no intervalo de: 71 e 100", valor);
		  }else { 
		  	System.out.println("Fora do intervalo!!!"); 
		  }
		  
		  sc.close();
		  
		  */ 
		
		 /*>>>>>>EXERCICIO 07
		
		  Scanner sc = new Scanner(System.in);
		  Locale.setDefault(Locale.US);
			 
		  double x, y;
			 
		  System.out.print("Digite o valor do eixo de x: "); 
		  x = sc.nextDouble();
		  System.out.print("Digite o valor do eixo de y: "); 
		  y = sc.nextDouble();
			 
		  if(x == 0.0 && y == 0.0 ) { 
			  System.out.println("ORIGEM!");
			  
		  }else if(x == 0.0){ 
			  System.out.println("Eixo de x");
			  
		  }else if(y == 0.0) {
			  System.out.println("Eixo de y"); 
			  
		  } else if(x > 0.0 && y > 0.0){
			  System.out.println("Q1");
			  
		  }else if(x < 0.0 && y > 0.0){
			  System.out.println("Q2"); 
			  
		  }else if(x < 0.0 && y< 0.0) {
			  System.out.println("Q3"); 
			  
		  }else{ 
			  System.out.println("Q4"); 
			  }
		  sc.close();
		  }*/
	
		   /*>>>>>>EXERCICIO 08
		    
		   Scanner sc = new Scanner(System.in);
		   Locale.setDefault(Locale.US);
			 
		   double salario = sc.nextDouble(); double imposto;
			 
		   if (salario <= 2000.0) { 
			   imposto = 0.0; 
		   }else if (salario <= 3000.0) {
			   imposto = (salario - 2000.0) * 0.08; 
		   }else if (salario <= 4500.0) {
			   imposto= (salario - 3000.0) * 0.18 + 1000.0 * 0.08; 
		   }else { 
			   imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; 
		   }
		   if (imposto == 0.0) {
				  System.out.println("Isento"); 
		   }else {
			  System.out.printf("R$ %.2f%n", imposto); 
		   }
		

			// a += b > a = a + b; Isso vale para outros operadores!(-,*,/,%)
			
		   System.out.println("Quantidade de minutos: "); int minutos = sc.nextInt();
		   double conta = 50.0; if(minutos > 100) { conta += (minutos - 100)* 2.0; }
			  
		   System.out.printf("Valor da conta = R$ %.2f%n", conta);
			 
			
		   sc.close();*/
		
		/*>>>>>>EXERCICIO DOS VIDEOS
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double nota1, nota2, notaFinal;
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		if(notaFinal < 60) {
			System.out.printf("O aluno obteve a nota de : %.2f!!!", notaFinal);
			System.out.println("REPROVADO!");
			
		}else {
			System.out.printf("O aluno obteve a nota de: %.2f!!!", notaFinal);
		}
		
		 sc.close();*/
		
		/*>>>>>>Calculando x1 e x2, Formula de bhaskara*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a, b, c, delta, x1,x2, r1, r2;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		c= sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c ;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		r1 = x1;
		r2 = x2;
		
		if(a == 0 || delta < 0.0 ) {
			System.out.println("Impossivel calcular");
		}else {
			System.out.printf("R1: %.5f%n", r1);
			System.out.printf("R2: %.5f%n", r2);
		}
		sc.close();
	}
		 
}


