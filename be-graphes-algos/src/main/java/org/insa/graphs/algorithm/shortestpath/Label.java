package org.insa.graphs.algorithm.shortestpath;

import org.insa.graphs.model.Arc; 
import org.insa.graphs.model.Node;
public class Label {
	
	private Node sommet; // pouvoir assoicier un label a chaque noeud
	private boolean marque;
	protected double cout;
	private Arc pere;
	
	public Label(Node sommet) {
		this.sommet = sommet;
		this.marque = false;
		this.cout = Double.POSITIVE_INFINITY;
		this.pere = null;
		
		
	}
	public Node getSommet() {
		return this.sommet;
				
	}
	public boolean getMarque() {
		return this.marque;
	}
	
	public double getCost() {
		return this.cout;
	}
	public Arc getPere() {
		return this.pere;
	}
	
	public void setMarque(boolean marque) {
		this.marque=marque;
				
	}
	public void setCost(double cout) {
		this.cout=cout;
	}
	public void setPere(Arc pere ) {
		this.pere=pere;
	}
	
}
	


