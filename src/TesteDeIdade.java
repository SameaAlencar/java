import java.util.Scanner;

public class TesteDeIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		
		int idade = leitor.nextInt();
		System.out.println("Sua idade � " + idade);
		//Tomar a decis�o
		if (idade >= 18) {
			System.out.println("Voc� � maior!");
		}else {
			System.out.println("Voc� � menor!" );
			}		
		
		
		
		// TODO Auto-generated method stub

	}

}
