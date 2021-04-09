package main.java.client.export;

import main.java.client.graph.node.Ciudad;
import main.java.client.graph.node.Industria;
import main.java.client.graph.node.LugarTurismo;

public interface Exportador {

    String exportarCiudad(Ciudad ciudad);
    String exportarIndustria(Industria industria);
    String exportarLugarTurismo(LugarTurismo lugarTurismo, int calificacion);
}