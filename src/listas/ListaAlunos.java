package listas;

import model.Alunos;

public class ListaAlunos {

	private class Node {
		Node next;
		Alunos aluno;
	}

	private Node head = null;
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
			
	}
	

	public void insert(Alunos alunoI) {
		Node n = new Node();
		n.aluno = alunoI;

		if (head == null) {
			n.next = null;
			head = n;
		} else {
			if (n.aluno.getRm() < head.aluno.getRm()) {
				n.next = head;
				head = n;
			} else {
				Node aux = head;
				boolean achou = false;
				while (aux.next != null && !achou) {
					if (aux.aluno.getRm() < n.aluno.getRm()) {
						aux = aux.next;
					} else
						achou = true;
				}
				n.next = aux.next;
				aux.next = n;

			}

		}

	}

	public String atender() {
	
		if(isEmpty())
			return "Fila Vazia, impossivel atender";
		else {
			
		Node aux = head;
		head = head.next;

		return aux.aluno.toString();
		}

	}

	public void show() {
		Node aux = head;
		System.out.println("***** LISTA *****");
		while (aux != null) {
			System.out.println("\t " + aux.aluno.toString());
			aux = aux.next;
		}
	}

}
