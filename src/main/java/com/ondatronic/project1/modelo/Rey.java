package com.ondatronic.project1.modelo;

public class Rey extends Ficha {

    public Rey(Color color) {
        super(color);
    }

    @Override
    public Boolean mover (Casilla destino) {
        // TODO: Falta implemnentar método
        
        return true;
    }   

    @Override
    public String toString() {
        return "R" + (getColor() == Color.BLANCO ? "B" : "N");
    }

}
