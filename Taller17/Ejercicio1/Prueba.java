package Taller17.Ejercicio1;

public class Prueba { 
    public static void main(String[] args) { 
        Figura circulo = new Circulo(10); 
        Figura rectangulo = new Rectangulo(8, 6);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}
