package Programa1;

public class Dados {
    private Integer lanzar;


    public Dados() {

        this.lanzar = 1 + (int)(Math.random() * ((6 - 1) + 1));
    }


    public Integer getLanzar() {
        return lanzar;
    }

    public int lanzamiento() {
        System.out.println("\nSimulacion De Dados");
        System.out.println("\nTirando Dados................");
        double probabilidad_lanzar = Math.random();
        System.out.println("Tú numero es: " +lanzar);
        System.out.println("\nAgregando a la lista de resultados... ");

        return 0;
    }
}