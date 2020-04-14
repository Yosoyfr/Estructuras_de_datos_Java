/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import structures.Simply_Linked_List;

/**
 *
 * @author Francisco Suarez
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		//Pruebas lista simplemente enlazada
		Simply_Linked_List LinkedList = new Simply_Linked_List();
		LinkedList.addLast(5);
		LinkedList.addLast(8);
		LinkedList.print();
		LinkedList.remove(8);
		LinkedList.remove(5);
		LinkedList.print();
	}
	
}
