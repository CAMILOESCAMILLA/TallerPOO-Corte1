package Taller12punto1.ejercicio2;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal esta volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal esta nadando.");
    }
}
