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
public class Queue {

	private Simple_Node first;
	private Simple_Node last;
	int size;

	//Constructor de la cola
	public Queue() {
		this.first = this.last = null;
		this.size = 0;
	}

	//Tamaño de la pila
	public int getSize() {
		return size;
	}

	//Verifica si la cola esta vacia
	boolean isEmpty() {
		return this.first == null;
	}

	//Inserta datos a la cola, por el final
	public void enqueue(Object data) {
		Simple_Node n = new Simple_Node(data);
		if (isEmpty()) {
			this.first = n;
		} else {
			this.last.setNext(n);
		}
		this.last = n;
		this.size++;
	}

	//Remueve el dato al frente de la cola
	public Object dequeue() {
		Object aux = null;
		if (!isEmpty()) {
			aux = this.first.getData();
			this.first = this.first.getNext();
			this.size--;
		}
		return aux;
	}

	//Obtiene la cima de la cola
	public Object peek() {
		return first.getData();
	}
}
