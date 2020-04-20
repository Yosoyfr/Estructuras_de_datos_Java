/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

/**
 *
 * @author Francisco Suarez
 */
public class Tree_Node {

	//El dato que contendra el nodo
	private Object data;
	//Enlace siguiente del nodo
	private Tree_Node left;
	//Enlace anterior del nodo
	private Tree_Node right;

	//Constructor del nodo
	public Tree_Node(Object data) {
		this.data = data;
		this.left = this.right = null;
	}

	//Accesores y modificadores de los atributos del nodo
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Tree_Node getLeft() {
		return left;
	}

	public void setLeft(Tree_Node left) {
		this.left = left;
	}

	public Tree_Node getRight() {
		return right;
	}

	public void setRight(Tree_Node right) {
		this.right = right;
	}

}
