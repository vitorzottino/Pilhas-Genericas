package listas;

public class ListaIntAsc {

	private class NodeInt {
		NodeInt prox;
		int dado;
	}

	private NodeInt lista = null;

	public void insert(int elem) {
		NodeInt newNode = new NodeInt();
		newNode.dado = elem;

		if (lista == null) {
			newNode.prox = null;
			lista = newNode;
		} else {
			if (newNode.dado < lista.dado) {
				newNode.prox = lista;
				lista = newNode;
			} else {
				NodeInt aux = lista;
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
		NodeInt aux = lista;
		System.out.println("***** Lista *****");
		while (aux != null) {
			System.out.println("\t" + aux.dado);
			aux = aux.prox;
		}
	}

}
