package listas;

public class ListaIntAsc {

	private class NodeInt {
		NodeInt prox;
		int dado;
	}

	private NodeInt topoLista = null;

	public void insert(int elem) {
		NodeInt newNode = new NodeInt();
		newNode.dado = elem;

		if (topoLista == null) {
			newNode.prox = null;
			topoLista = newNode;
		} else {
			if (newNode.dado < topoLista.dado) {
				newNode.prox = topoLista;
				topoLista = newNode;
			} else {
				NodeInt aux = topoLista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado < newNode.dado)
						aux = aux.prox;

					else
						achou = true;
				}

				newNode.prox = aux.prox;
				aux.prox = newNode;

			}

		}

	}

	public void show() {
		NodeInt aux = topoLista;
		System.out.println("***** LISTA *****");
		while (aux != null) {
			System.out.println("\t" + aux.dado);
			aux = aux.prox;
		}
	}

	public int counter() {
		int count = 0;
		NodeInt aux = topoLista;
		while (aux != null) {
			count++;
			aux = aux.prox;
		}

		return count;
	}

	public void showTop(int limite) {
		NodeInt aux = topoLista;
		System.out.println("***** LISTA *****");
		while (aux != null) {
			if (aux.dado > limite) {
				System.out.println("\t " + aux.dado);
				aux = aux.prox;
			} else
				aux = aux.prox;
		}
	}

}
