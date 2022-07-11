package com.ondatronic.project1.modelo;

public class Caballo extends Ficha {

    public Caballo(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return "C" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
