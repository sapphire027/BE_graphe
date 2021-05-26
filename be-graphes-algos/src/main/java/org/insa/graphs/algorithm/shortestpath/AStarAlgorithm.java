package org.insa.graphs.algorithm.shortestpath;

import org.insa.graphs.algorithm.AbstractInputData.Mode;
import org.insa.graphs.model.*;

public class AStarAlgorithm extends DijkstraAlgorithm {

    public AStarAlgorithm(ShortestPathData data) {
        super(data);
    }
    protected void Init(Label[] Labels, Graph graph, ShortestPathData data) {
    	// Plus court chemin en mode time
    	if (data.getMode() == Mode.TIME) {
    		double vitessemax = (double) data.getGraph().getGraphInformation().getMaximumSpeed()/3.6 ; // km/h -> m/s 
    		for (int i = 0 ; i < graph.size(); i++) {
        		//distance entre 2 points
        		double distance = Point.distance(graph.get(i).getPoint(), data.getDestination().getPoint());
            	Labels[i] = new LabelStar(data.getGraph().get(i), false, Double.POSITIVE_INFINITY, null, distance/vitessemax) ;
            }     
    	}
    	//Plus court chemin en mode distance
    	else {
	    	for (int i = 0 ; i < graph.size(); i++) {
	    		
	    		double distance = Point.distance(graph.get(i).getPoint(), data.getDestination().getPoint());
	        	Labels[i] = new LabelStar(data.getGraph().get(i), false, Double.POSITIVE_INFINITY, null, distance) ;
	        } 
    	}
   }
}
