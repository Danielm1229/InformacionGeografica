package main.java.client.graph.node;

import main.java.client.export.Exportador;

public class Industria extends Node{
    public Industria(Long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String exportar(Exportador exportador) {
        return exportador.exportarIndustria(this);
    }

}