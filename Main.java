import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Personaje> personajes = new ArrayList<>();
            int opcion = 0;

            do {
            System.out.println("========== MENÚ ==========");
            System.out.println("1. Registrar personaje");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Buscar personaje por id");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número.");
                sc.nextLine(); // limpiar buffer
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.println("Tipo de personaje: 1=Guerrero, 2=Mago");
                    int tipo = sc.nextInt();
                    System.out.print("Ingrese id: ");
                    int id = sc.nextInt();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese nivel (1-100): ");
                    int nivel = sc.nextInt();

                    if (id > 0 && !nombre.isEmpty() && nivel >= 1 && nivel <= 100) {
                        switch (tipo) {
                            case 1 -> personajes.add(new Guerrero(id, nombre, nivel));
                            case 2 -> personajes.add(new Mago(id, nombre, nivel));
                            default -> System.out.println("Tipo inválido.");
                        }
                    } else {
                        System.out.println("Datos inválidos. No se registró el personaje.");
                    }
                }

                case 2 -> {
                    if (personajes.isEmpty()) {
                        System.out.println("No hay personajes registrados.");
                    } else {
                        for (Personaje p : personajes) {
                            p.mostrarInfo();
                            System.out.println(p.realizarAccion());
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese id a buscar: ");
                    int buscarId = sc.nextInt();
                    boolean encontrado = false;
                    for (Personaje p : personajes) {
                        if (p.getId() == buscarId) {
                            p.mostrarInfo();
                            System.out.println(p.realizarAccion());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Personaje no encontrado.");
                    }
                }

                case 4 -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    System.out.println("Opción inválida.");
                }
            }
            } while (opcion != 4);
        }
    }
}
