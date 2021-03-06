/* ==========================================
 * GrapheMultiPlateforme : a free Java graph-theory library
 * ==========================================
 * 
 * salmuz : Carranza Alarcon Yonatan Carlos
 * 
 * (C) Copyright 2013, by salmuz and Contributors.
 * 
 * Project Info:  https://github.com/salmuz/Graphes_Multi_Plateformes
 * Project Creator:  salmuz (https://www.assembla.com/spaces/salmuz-java) 
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc.,
 * 
 * ------------------
 * Point.java
 * ------------------
 * (C) Copyright 2013, by salmuz and Contributors
 *
 * Original Author: Carranza Alarcon Yonatan Carlos
 * Contributor(s):  Coz Velasquez Antonio
 * 					Kalil DAHER MOHAMED
 *                  Aben Nouh Abdirazak 
 *
 * Changes
 * -------
 * 13/02/13 : Version 01;
 *
 */
package fr.edu.bp.m1info.swing.design;

import fr.edu.bp.m1info.structure.design.Graphics;
import fr.edu.bp.m1info.structure.graph.Graph;
import fr.edu.bp.m1info.structure.graph.edge.AbstractEdge;
import fr.edu.bp.m1info.structure.graph.vertex.Vertex;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GraphCanvas<Edge extends AbstractEdge,Node extends Vertex> extends Canvas {

    private Graph<Edge,Node> graph;
    private List<Edge> draftEdge;

    public GraphCanvas(Graph<Edge,Node> graph) {
        super();
        this.graph = graph;
        this.draftEdge = new ArrayList<Edge>();
    }

    public Graph<Edge, Node> getGraph() {
        return graph;
    }

    @Override
    public void update(java.awt.Graphics g) {
       // super.update(g); clear et call method paint
       paint(g);
    }

    @Override
    public void paint(java.awt.Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        Graphics2D  g2D = (Graphics2D)g;
        Graphics graphics = new DesignGeometric2D(g2D);


        for (Edge e: draftEdge){
            e.draw(graphics);
        }

        for (Edge e : graph.getEdgeList()) {
            e.draw(graphics);
        }

        for (Node n : graph.getVertexList()) {
            n.draw(graphics);
        }

    }

    public List<Edge> getDraftEdge() {
        return draftEdge;
    }
}
