import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lote = {"Jeans Airflex", "Graphic tee", "Denim Jacket", null, null};
        int opcion;

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. listar coleccion en bodega");
            System.out.println("2. buscar referencia en lote");
            System.out.println("3. ingresar prenda al lote");
            System.out.println("4. salir");
            System.out.println("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nReferencias en bodega:");
                    boolean vacia = true;

                    for (int i = 0; i < lote.length; i++) {
                        if (lote[i] != null) {
                            System.out.println("- " + lote[i]);
                            vacia = false;
                        }
                    }
                    if (vacia) {
                        System.out.println("La bodega esta vacia.");
                    }
                    break;

            }
        }
    }         
}    