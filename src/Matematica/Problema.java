package Matematica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     DecimalFormat df = new DecimalFormat("0.00");
	     //declaração de variaveis
		 double num, num1, num2, num3;
		 String resp;
	     //entrada de dados, processamento e saida
		 System.out.println(" -------------------------------------------------------------- ");
	     System.out.println("|                !!  INFORME O SEU PRATO !!                    |");
	     System.out.println(" -------------------------------------------------------------- ");
	     System.out.println("|                      #  Valores  #                           |");
	     System.out.println("|          Arroz R$1,00 ,Carne R$3,00 ,Salada R$2,00           |");
	     System.out.println(" -------------------------------------------------------------- ");
	     System.out.println("|                          Prato 1                             |");
	     System.out.println("|2 porcoes de Arroz,  1 porcoes de Carne,  1 porcao de Salada  |");
	     System.out.println("|                          Prato 2                             |");
	     System.out.println("|1 Porcao de Arroz,  2 porcoes de Carne,  1 porcao de Salada   |");
	     System.out.println("|                          Prato 3                             |");
	     System.out.println("|2 porcoes de Arroz,  2 porcoes de Carne,  0 porcao de Salada  |");
	     System.out.println(" -------------------------------------------------------------- ");
	     System.out.println("Digite aqui o numero do seu prato: ");
	     num = leia.nextDouble();
		 while( num <=0 || num >=4 ){
		 
			System.out.println("Voce digitou o prato errado ! *Digite novamente* ");
			System.out.println("Digite o numero do seu prato: (1 a 3)");	
			num = leia.nextDouble(); 
		 	 
		 }
		 
		 if ( num==1 ){
			System.out.println("2 porcoes de Arroz,  1 porcoes de Carne,  1 porcao de Salada"); 
			System.out.println("O valor do seu prato ficou: R$7,00"); 
			System.out.println("Deseja montar o seu prato ? (sim ou nao)");
			resp = leia.next();
			while ( !resp.equalsIgnoreCase("sim")&& !resp.equalsIgnoreCase("nao")){
				System.out.println("Opcao invalida ! *Tente novamente*");		
				System.out.println("Deseja montar o seu prato ? (sim ou nao)");
				resp = leia.next();
				
				
			}
			if( resp.equalsIgnoreCase("sim")){
				System.out.println("Digite a porcao do arroz: ");
				num1 = leia.nextDouble();
				while ( num1 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao do arroz: ");				
					num1 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da carne: ");
				num2 = leia.nextDouble();
				while ( num2 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da carne: ");				
					num2 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da salada: ");
				num3 = leia.nextDouble();
				while ( num3 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da salada: ");				
					num3 = leia.nextDouble();
				
				}
				System.out.println((int)num1+" Porcoes de Arroz, "+(int)num2+ " Porcoes de Carne, "+(int)num3+" Porcao de Salada ");
				System.out.println("O valor do seu prato ficou: "+"R$"+df.format ((num1*1)+(num2*3)+(num3*2)));
				
		 
	     
			}
			else if ( resp.equalsIgnoreCase("nao") ){
				System.out.println("Obrigado !! *Finalizado* ");
				
				
			}
			
			
		 }
		 else if ( num==2 ){
			System.out.println("1 Porcao de Arroz,  2 porcoes de Carne,  1 porcao de Salada"); 
			System.out.println("O valor do seu prato ficou: R$9,00"); 
			System.out.println("Deseja montar o seu prato ? (sim ou nao)");
			resp = leia.next();
			while ( !resp.equalsIgnoreCase("sim")&& !resp.equalsIgnoreCase("nao")){
				System.out.println("Opcao invalida ! *Tente novamente*");		
				System.out.println("Deseja montar o seu prato ? (sim ou nao)");
				resp = leia.next();
				
				
			}
			if( resp.equalsIgnoreCase("sim")){
				System.out.println("Digite a porcao do arroz: ");
				num1 = leia.nextDouble();
				while ( num1 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao do arroz: ");				
					num1 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da carne: ");
				num2 = leia.nextDouble();
				while ( num2 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da carne: ");				
					num2 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da salada: ");
				num3 = leia.nextDouble();
				while ( num3 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da salada: ");				
					num3 = leia.nextDouble();
				
				}
				System.out.println((int)num1+" Porcoes de Arroz, "+(int)num2+ " Porcoes de Carne, "+(int)num3+" Porcao de Salada ");
				System.out.println("O valor do seu prato ficou: "+"R$"+df.format ((num1*1)+(num2*3)+(num3*2)));
			
		 
	     
			}
			else if ( resp.equalsIgnoreCase("nao") ){
				System.out.println("Obrigado !! *Finalizado* ");			
				
			}
			 
			 
			 
			 
		 }
		 else if (  num==3 ) {
			System.out.println("2 Porcao de Arroz,  2 porcoes de Carne,  0 porcao de Salada"); 
			System.out.println("O valor do seu prato ficou: R$8,00"); 
			System.out.println("Deseja montar o seu prato ? (sim ou nao)");
			resp = leia.next();
			while ( !resp.equalsIgnoreCase("sim")&& !resp.equalsIgnoreCase("nao")){
				System.out.println("Opcao invalida ! *Tente novamente*");		
				System.out.println("Deseja montar o seu prato ? (sim ou nao)");
				resp = leia.next();
				
				
			}
			if( resp.equalsIgnoreCase("sim")){
				System.out.println("Digite a porcao do arroz: ");
				num1 = leia.nextDouble();
				while ( num1 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao do arroz: ");				
					num1 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da carne: ");
				num2 = leia.nextDouble();
				while ( num2 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da carne: ");				
					num2 = leia.nextDouble();
				
				}
				System.out.println("Digite a porcao da salada: ");
				num3 = leia.nextDouble();
				while ( num3 < 0 ){
					System.out.println("Numero negativo ! *Digite novamente*");
					System.out.println("Digite a porcao da salada: ");				
					num3 = leia.nextDouble();
				
				}
				System.out.println((int)num1+" Porcoes de Arroz, "+(int)num2+ " Porcoes de Carne, "+(int)num3+" Porcao de Salada ");
				System.out.println("O valor do seu prato ficou: "+"R$"+df.format ((num1*1)+(num2*3)+(num3*2)));
				
		 
	     
			}
			else if ( resp.equalsIgnoreCase("nao") ){
				System.out.println("Obrigado !! *Finalizado* ");
				
				
			}
			 
			 
			 
			 
			 
			 
		 }
		

	}

}
