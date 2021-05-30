package calculoconta;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
          
		  int numero,hora;
		  double valorhora,salario;
		  
		  System.out.println("digite seu numero");
		  numero = sc.nextInt();
		  System.out.println("digite o valor do salario");
		  salario = sc.nextDouble();
		  System.out.println("digite quantas hora trabalhadas");
		  hora = sc.nextInt();
		  System.out.println("digite o valor da hora");
		  valorhora = sc.nextDouble();
		  
		  salario = valorhora * hora + salario;
		  
		  System.out.println("o salario bruto é" + salario);
	}

}
