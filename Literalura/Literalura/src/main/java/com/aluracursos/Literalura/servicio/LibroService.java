package com.aluracursos.Literalura.servicio;

public interface LibroService {
    void buscarLibroPorTitulo(String titulo);
    void listarLibrosRegistrados();
    void listarAutoresRegistrados();
    void listarAutoresVivosEnAño(int año);
    void listarLibrosPorIdioma(String idioma);
}