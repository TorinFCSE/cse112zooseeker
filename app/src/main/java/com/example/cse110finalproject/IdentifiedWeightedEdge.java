package com.example.cse110finalproject;

import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.nio.Attribute;

/**
 * Exactly like a DefaultWeightedEdge, but has an id field we
 * can use to look up the information about the edge with.
 */
public class IdentifiedWeightedEdge extends DefaultWeightedEdge {
    private String id = null;
    Object source;
    Object target;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    @Override
    public String toString() {
        return "(" + getSource() + " :" + id + ": " + getTarget() + ")";
    }

    public String getSourceStr() {
        return (String) getSource();
    }

    public String getTargetStr() {
        return (String) getTarget();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }
    public static void attributeConsumer(Pair<IdentifiedWeightedEdge, String> pair, Attribute attr) {
        IdentifiedWeightedEdge edge = pair.getFirst();
        String attrName = pair.getSecond();
        String attrValue = attr.getValue();
        
        if (attrName.equals("id")) {
            edge.setId(attrValue);
        }
    }
}
