import java.util.Scanner;

public class Exerc {

	public static void main(String[] args) {
		
		
		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("--------------");
		System.out.println(" MÉDIA FINAL");
		System.out.println("--------------");
		System.out.println();
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("Qual nome do aluno?  ");
		String nomeAluno;
		
		
		nomeAluno = leitor.next();
		
		System.out.println("Nota do bimestre 1: ");
		nota1 = leitor.nextDouble();
		
		System.out.println("Nota do bimestre 2: ");
		nota2 = leitor.nextDouble();
		
		System.out.println("Nota do bimestre 3: ");
		nota3 = leitor.nextDouble();
		
		System.out.println("Nota do bimestre 4: ");
		nota4 = leitor.nextDouble();
		
		System.out.println("*****Resultado***** ");
		
		double notafinal;
		double notafinal1 = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notafinal1 >= 6) {
			System.out.println("Aprovado");
			
		}else { 
			System.out.println("Reprovado ");
			
		}
		
		// TODO Auto-generated method stub

	}

}
