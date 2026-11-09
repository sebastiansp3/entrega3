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
            System.out.print("Seleccione una opcion: ");

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

                case 2:
                    System.out.print("Ingrese el nombre de la prenda a buscar: ");
                    String nombreBuscado = sc.nextLine();

                    boolean encontrado = buscarReferencia(lote, nombreBuscado);
                    
                    if (encontrado) {
                        System.out.println("La prenda " + nombreBuscado + " esta guardada.");
                    } else {
                        System.out.println("La prenda " + nombreBuscado + " no se encuentra en este lote.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la nueva referencia: ");
                    String nuevaPrenda = sc.nextLine();

                    boolean ingresado = false;
                    
                    for (int i = 0; i < lote.length; i++) {
                        if (lote[i] == null) {
                            lote[i] = nuevaPrenda;
                            System.out.println("Prenda " + nuevaPrenda + " guardada exitosamente en la posicion " + i + ".");
                            ingresado = true;
                            break; 
                        }
                    }

                    if (!ingresado) {
                        System.out.println("Error: no hay espacio disponible en el lote.");
                    }
                    break;

                case 4:
                    System.out.println("Cerrando la aplicacion...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    } 

    