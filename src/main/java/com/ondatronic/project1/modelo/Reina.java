package com.ondatronic.project1.modelo;

public class Reina extends Ficha {

    public Reina(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String toString() {
        return "Q" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
