package com.ondatronic.project1.modelo;

public class Alfil extends Ficha {

    public Alfil(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String toString() {
        return "A" + (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
