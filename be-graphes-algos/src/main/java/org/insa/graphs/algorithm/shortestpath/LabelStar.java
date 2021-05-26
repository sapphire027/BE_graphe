package org.insa.graphs.algorithm.shortestpath;

import org.insa.graphs.model.*;

public class LabelStar extends Label{
	
	private double estimatedCost;  //coût estimé entre le Lable courant et le label destination     heuristique 
	
	public LabelStar(Node node, boolean marque, double cout, Arc father, double estCost) {
		super(node, marque, cout, father);
		this.estimatedCost= estCost; 
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
		
    	public double getTotalCost() {
		return this.getEstimatedCost() + super.getCost(); 
	}
	
}