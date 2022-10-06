package App;

import java.util.Scanner;

import Entidade.Animal;
import Entidade.Ave;
import Entidade.Mamifero;
import Entidade.Reptil;

public class MainAnimal {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menu = 0;

		do {
			System.out.println("__________ONG MEDVET ANIMAL FELIZ___________");
			System.out.println("****** Cadastre um novo animal******");
			System.out.println("Selecione uma opção para cadastrar: ");
			System.out.println("1 - Mamifero ");
			System.out.println("2 - Ave");
			System.out.println("3 - Reptil ");
			System.out.println("4 - Fechar cadastro ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Informe um id do animal: ");
				int idRegistroMamifero = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Informa o nome do animal: ");
				String nomeMamifero = scanner.nextLine();
				System.out.println("Informe a espécie do animal: ");
				String especieMamifero = scanner.nextLine();
				System.out.println("Informe o sexo do animal: ");
				String sexoMamifero = scanner.nextLine();
				System.out.println("Informe a cor do animal: ");
				scanner.nextLine();
				String corMamifero = scanner.nextLine();
				System.out.println("Informe tipo de pele do animal: ");
				String peleMamifero = scanner.next();
				scanner.nextLine();
				System.out.println("Informe o peso do animal: ");
				double pesoMamifero = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Informe a idade aproximada do animal: ");
				int idadeMamifero = scanner.nextInt();
				scanner.nextLine();

				Mamifero novoMamifero = new Mamifero(idRegistroMamifero, nomeMamifero, especieMamifero, sexoMamifero,
						corMamifero, pesoMamifero, idadeMamifero, peleMamifero);
				Animal.addMamifero(novoMamifero);
				System.out.println(novoMamifero);
				break;
			case 2:

				System.out.println("Informe um id do animal: ");
				int idRegistroAve = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Informa o nome do animal: ");
				String nomeAve = scanner.nextLine();
				System.out.println("Informe a espécie do animal: ");
				String especieAve = scanner.nextLine();
				System.out.println("Informe o sexo do animal: ");
				String sexoAve = scanner.nextLine();
				System.out.println("Informe a cor do animal: ");
				scanner.nextLine();
				String corAve = scanner.nextLine();
				System.out.println("Informe tipo de pele do animal: ");
				String peleAve = scanner.next();
				scanner.nextLine();
				System.out.println("Informe o peso do animal: ");
				double pesoAve = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Informe a idade aproximada do animal: ");
				int idadeAve = scanner.nextInt();
				scanner.nextLine();

				Ave novaAve = new Ave(idRegistroAve, nomeAve, especieAve, sexoAve, corAve, pesoAve, idadeAve, peleAve);
				Animal.addAve(novaAve);
				System.out.println(novaAve);
				break;

			case 3:
				System.out.println("Informe um id do animal: ");
				int idRegistroReptil = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Informa o nome do animal: ");
				String nomeReptil = scanner.nextLine();
				System.out.println("Informe a espécie do animal: ");
				String especieReptil = scanner.nextLine();
				System.out.println("Informe o sexo do animal: ");
				String sexoReptil = scanner.nextLine();
				System.out.println("Informe a cor do animal: ");
				scanner.nextLine();
				String corReptil = scanner.nextLine();
				System.out.println("Informe tipo de pele do animal: ");
				String peleReptil = scanner.next();
				scanner.nextLine();
				System.out.println("Informe o peso do animal: ");
				double pesoReptil = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Informe a idade aproximada do animal: ");
				int idadeReptil = scanner.nextInt();
				scanner.nextLine();

				Reptil novoReptil = new Reptil(idRegistroReptil, nomeReptil, especieReptil, sexoReptil, corReptil,
						pesoReptil, idadeReptil, peleReptil);
				Animal.addReptil(novoReptil);
				System.out.println(novoReptil);
				break;
				
				default:
					System.out.println("Nenhum animal foi cadastrado, retorne ao menu inicial.");
					break;	
			}
			
		} while (menu <= 3);
		
		scanner.close();
	}
}
	
		
		
		
