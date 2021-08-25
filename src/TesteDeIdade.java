import java.util.Scanner;

public class TesteDeIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		
		int idade = leitor.nextInt();
		System.out.println("Sua idade é " + idade);
		//Tomar a decisão
		if (idade >= 18) {
			System.out.println("Você é maior!");
		}else {
			System.out.println("Você é menor!" );
			}		
		
		
		
		// TODO Auto-generated method stub

	}

}
