package com.ondatronic.project1.modelo;

public class Torre extends Ficha {

    public Torre(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub

        return true;
    }

    @Override
    public String toString() {
        return "T" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
