package org.insa.graphs.algorithm.shortestpath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.insa.graphs.algorithm.AbstractSolution.Status;
import org.insa.graphs.algorithm.utils.BinaryHeap;
import org.insa.graphs.algorithm.shortestpath.Label;
import org.insa.graphs.model.Arc;
import org.insa.graphs.model.Graph;
import org.insa.graphs.model.Node;
import org.insa.graphs.model.Path;

public class DijkstraAlgorithm extends ShortestPathAlgorithm {

    public DijkstraAlgorithm(ShortestPathData data) {
        super(data);
    }

    @Override
    protected ShortestPathSolution doRun() {
        final ShortestPathData data = getInputData();
        // Retrieve the graph.
        Graph graph = data.getGraph();
        //case origin is the destination :
        if (data.getOrigin().getId()==data.getDestination().getId()) {
        	notifyDestinationReached(data.getDestination());
        	return new ShortestPathSolution(data,Status.OPTIMAL,new Path(graph,data.getDestination()));
        }
        final int nbNodes = graph.size();
        // Initialize
        double[] distances = new double[nbNodes];
        Arrays.fill(distances, Double.POSITIVE_INFINITY);
        distances[data.getOrigin().getId()] = 0;
        
        BinaryHeap<Label> heap = new BinaryHeap<>();
        

        ShortestPathSolution solution = null;
        // TODO:
        
        return solution;
    }

}
