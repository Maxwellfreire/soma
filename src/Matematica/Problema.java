package Matematica;

import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		 //declaração da variavel
		 double v, a, raio, altura;
		 
		 //entrada de dados
		 System.out.println("Digite o primeiro numero: ");
		 raio = leia.nextDouble();
		 System.out.println("Digite o segundo numero: ");
		 altura = leia.nextDouble();
		 //processamento
		 v = 3.1413 * raio * raio * altura;
		 a = 2*3.1413 * raio *(altura+raio);
		 //saida de dados
		 System.out.println("No resultado obter o volume: "+ v + "e a sua area: "+ a);
		

	}

}
