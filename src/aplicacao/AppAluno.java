package aplicacao;

import java.util.Scanner;

import listas.ListaAlunos;
import model.Alunos;

public class AppAluno {

	public static void main(String[] args) {

		ListaAlunos listaTeste = new ListaAlunos();
		Scanner input = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 3) {
			System.out.println("\nMENU");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Atender Aluno");
			System.out.println("3 - Sair");
			opcao = input.nextInt();

			switch (opcao) {
			case 1: {

				Alunos aluno = new Alunos();
				System.out.print("Informe o RM: ");
				aluno.setRm(input.nextInt());
				System.out.print("Informe o Nome: ");
				input.nextLine();
				aluno.setNome(input.next());
				System.out.print("Informe a media: ");
				double nota = input.nextDouble();
				aluno.setMedia(nota);
				listaTeste.insert(aluno);
				break;

			}
			case 2: {
			System.out.print("Aluno atendido: " + listaTeste.atender());
			}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		}
		input.close();

	}

}
