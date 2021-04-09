package main.java.client.export;

import main.java.client.graph.node.Ciudad;
import main.java.client.graph.node.Industria;
import main.java.client.graph.node.LugarTurismo;

public class XMLExportador implements Exportador {
    public String exportarCiudad(Ciudad ciudad) {
        return String.format("<Ciudad id='%d'>%s</Ciudad>", ciudad.getId(), ciudad.getNombre());
    }

    public String exportarIndustria(Industria industria) {
        return String.format("<Industria id='%d'>%s</Industria>", industria.getId(), industria.getNombre());
    }

    public String exportarLugarTurismo(LugarTurismo lugarTurismo, int calificacion) {
        return String.format("<LugarTurismo id='%d' calificacion='%s'>%s</LugarTurismo>", lugarTurismo.getId(), lugarTurismo.getNombre(), calificacion);
    }
}
