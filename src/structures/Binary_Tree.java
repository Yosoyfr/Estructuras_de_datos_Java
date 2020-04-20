/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import nodes.Tree_Node;

/**
 *
 * @author Francisco Suarez
 */
public class Binary_Tree {

	//Raiz del arbol
	private Tree_Node root;
	//Tamaño
	private int size;

	//Constructor del arbol
	public Binary_Tree() {
		this.root = null;
		this.size = 0;
	}

	//Verifica si el arbol esta vacio
	boolean isEmpty() {
		return this.root == null;
	}

	//Metodo insertar ordenadamente para busquedas
	public void insert(Object data) {
		this.root = null;
	}

	Tree_Node insert(Tree_Node aux, Object data) {
		if (aux == null) {
			aux = new Tree_Node(data);
			this.size++;
		} else if ((int) data < (int) aux.getData()) {
			Tree_Node left_Aux = insert(aux.getLeft(), data);
			aux.setLeft(left_Aux);
		} else if ((int) data > (int) aux.getData()) {
			Tree_Node left_Aux = insert(aux.getRight(), data);
			aux.setRight(left_Aux);
		} else if ((int) data == (int) aux.getData()) {
			System.out.println("Ya existe el dato");
		}
		return aux;
	}
	
	//

	//Accesores de los atributos
	public Tree_Node getRoot() {
		return root;
	}

	public int getSize() {
		return size;
	}

}
