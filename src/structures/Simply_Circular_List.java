/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import nodes.Simple_Node;

/**
 *
 * @author Francisco Suarez
 */
public class Simply_Circular_List {

	private Simple_Node init;
	private int size;

	//Accesores de los atributos de la lista
	public Simple_Node getInit() {
		return init;
	}

	public int getSize() {
		return size;
	}

	//Constructor vacio
	public Simply_Circular_List() {
		this.init = null;
		this.size = 0;
	}

	//Verifica si la lista esta vacia
	public boolean isEmpty() {
		return this.init == null;
	}

	//Insertar elementos en la lista por el inicio
	public void add(Object data) {
		Simple_Node n = new Simple_Node(data, null);
		if (!isEmpty()) {
			n.setNext(this.init.getNext());
			this.init.setNext(n);
		}
		this.init = n;
		this.size++;
	}

	//Busqueda en la lista (Retorna el nodo)
	public Simple_Node search(Object element) {
		Simple_Node aux = this.init;
		boolean found = false;
		do {
			if (element == aux.getData()) {
				found = true;
				break;
			}
			aux = aux.getNext();
		} while (aux != this.init && !found);

		//Si es encontrado lo devolvemos
		if (found) {
			return aux;
		} else {
			return null;
		}

	}

	//Metodos para eliminar de la lista
	public void remove(Object element) {
		if (!isEmpty()) {
			Simple_Node aux = this.init;
			while (aux.getNext() != this.init) {
				if (aux.getNext().getData() == element) {
					break;
				}
				aux = aux.getNext();
			}
			if (aux.getNext().getData() == element) {
				Simple_Node delete = aux.getNext();
				if (this.init == this.init.getNext()) {
					this.init = null;
				} else {
					if (delete == this.init) {
						this.init = aux;
					}
					aux.setNext(delete.getNext());
				}
			} else {
				System.out.println("No existe!!");
			}
		}
	}

	public void print() {
		if (!isEmpty()) {
			Simple_Node aux = this.init;
			do {
				System.out.println("El dato es: " + aux.getData() + " next: " + aux.getNext().getData());
				aux = aux.getNext();
			} while (aux != this.init);
		}
	}

}
