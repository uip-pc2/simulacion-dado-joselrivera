package Programa1;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class Main {




    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Dados> lista_dados = new ArrayList<Dados>();

        while(true) {
            int accion = 0;

            System.out.println("\nSimulacion De Dados");
            System.out.println("1. Tirar los dados");
            System.out.println("2. Observar resultados");
            System.out.println("3. Salir");

            try {
                System.out.print("OPCION: ");
                accion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("Error, opción no válida.");
            }

            switch (accion) {
                case 1:
                    Dados d = new Dados();
                    int tiro = d.lanzamiento();

                    if (tiro == 0)
                        lista_dados.add(d);
                    break;
                case 2:
                    if (lista_dados.size() == 0)
                        System.out.println("No haz tirado los dados");
                    else System.out.println("\nTus resultados de tiradas son: "); {for (Dados dd : lista_dados) {

                    System.out.println(Math.round(dd.getLanzar()));
                }
                }
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, opción no válida.");
            }
        }
    }
}