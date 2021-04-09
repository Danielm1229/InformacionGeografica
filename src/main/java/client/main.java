package main.java.client;

import main.java.client.export.XMLExportador;
import main.java.client.graph.Graph;
import main.java.client.graph.node.Ciudad;
import main.java.client.graph.node.Industria;
import main.java.client.graph.node.LugarTurismo;

public class main {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addNode(new Ciudad(1L, "Ciudad"));
        graph.addNode(new Industria(1L, "Industria"));
        graph.addNode(new LugarTurismo(1L, "LugarTurismo", 4));

        graph.setExportador(new XMLExportador());
        System.out.println(graph.exportar());
    }
}
