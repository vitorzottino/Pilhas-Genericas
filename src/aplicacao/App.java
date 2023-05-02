package aplicacao;

import java.util.Random;
import java.util.Scanner;

import listas.ListaIntAsc;

public class App {

	public static void main(String[] args) {

		ListaIntAsc lista = new ListaIntAsc();
		Random r = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
		int opcao = input.nextInt();

		while (opcao > 0) {
			lista.insert(r.nextInt(1, 100));
			lista.show();
			System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
			opcao = input.nextInt();
		}

		input.close();

	}

}
