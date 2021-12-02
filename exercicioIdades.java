import java.util.Locale;
import java.util.Scanner;

public class exercicioIdades {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		String nome1, nome2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
        idade1 = sc.nextInt();
        
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();
        
        media = (idade1 + idade2) / 2.0;
       
        System.out.println("A idade media de " + nome1 + " e " + nome2 + " eh de " + media + " anos."); 
        		
        sc.close(); 
	}

}
