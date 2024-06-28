package com.aluracursos.Literalura.controlador;

import com.aluracursos.Literalura.servicio.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // consume el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    libroService.buscarLibroPorTitulo(titulo);
                    break;
                case 2:
                    libroService.listarLibrosRegistrados();
                    break;
                case 3:
                    libroService.listarAutoresRegistrados();
                    break;
                case 4:
                    System.out.print("Ingrese el año: ");
                    int año = scanner.nextInt();
                    libroService.listarAutoresVivosEnAño(año);
                    break;
                case 5:
                    System.out.print("Ingrese el idioma: ");
                    String idioma = scanner.nextLine();
                    libroService.listarLibrosPorIdioma(idioma);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

    private void mostrarMenu() {
        System.out.println("Elija alguna de las siguientes opciones:");
        System.out.println("1. Buscar libro por título");
        System.out.println("2. Listar libros registrados");
        System.out.println("3. Listar autores registrados");
        System.out.println("4. Listar autores vivos en un determinado año");
        System.out.println("5. Listar libros por idioma");
        System.out.println("6. Salir");
    }
}
