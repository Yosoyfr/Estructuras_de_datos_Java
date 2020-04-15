/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import nodes.Double_Node;

/**
 *
 * @author Francisco Suarez
 */
public class Doubly_Circular_List {

	private Double_Node init;
	private int size;

	//Constructor de la lista circular doble
	public Doubly_Circular_List() {
		this.init = null;
		this.size = 0;
	}

	//Verifica se la lista esta vacia
	public boolean isEmpty() {
		return this.init == null;
	}

	//Inseta datos en la lista
	public void add(Object data) {
		Double_Node n = new Double_Node(data, null);
		if (!isEmpty()) {
			n.setNext(this.init.getNext());
			this.init.getNext().setPrevious(n);
			n.setPrevious(this.init);
			this.init.setNext(n);
		}
		this.init = n;
		this.size++;
	}

	//Busca un nodo a partir del elemento
	public Double_Node search(Object element) {
		boolean found = false;
		Double_Node aux = this.init;
		if (!isEmpty()) {
			do {
				if (aux.getData() == element) {
					found = true;
					break;
				}
			} while (aux != this.init && !found);
		}
		//Si es encontrado lo devolvemos
		if (found) {
			return aux;
		} else {
			return null;
		}
	}

	public void remove(Object element) {
		if (!isEmpty()) {
			Double_Node aux = this.init;
			while (aux.getNext() != this.init) {
				if (aux.getNext().getData() == element) {
					break;
				}
				aux = aux.getNext();
			}
			if (aux.getNext().getData() == element) {
				Double_Node delete = aux.getNext();
				if (this.init == this.init.getNext()) {
					this.init = null;
				} else {
					if (delete == this.init) {
						this.init = aux;
					}
					aux.setNext(delete.getNext());
					delete.getNext().setPrevious(aux);
				}
			} else {
				System.out.println("No existe!!");
			}
		}
	}

	public void print() {
		if (!isEmpty()) {
			Double_Node aux = this.init;
			do {
				System.out.println("prev: " + aux.getPrevious().getData() + " Dato: " + aux.getData() + " next: " + aux.getNext().getData());
				aux = aux.getPrevious();
			} while (aux != this.init);
		}
	}
}
