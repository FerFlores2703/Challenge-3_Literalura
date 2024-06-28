package com.aluracursos.Literalura.servicio;

import com.aluracursos.Literalura.modelo.Libro;
import com.aluracursos.Literalura.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    private static final String URL_BASE = "https://gutendex.com/books/?search=";

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public void buscarLibroPorTitulo(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        String url = URL_BASE + titulo;
        Libro[] libros = restTemplate.getForObject(url, Libro[].class);
        if (libros != null) {
            for (Libro libro : libros) {
                libroRepository.save(libro);
            }
        }
    }

    @Override
    public void listarLibrosRegistrados() {
        List<Libro> libros = libroRepository.findAll();
        libros.forEach(System.out::println);
    }

    @Override
    public void listarAutoresRegistrados() {
        List<String> autores = libroRepository.findAllAuthors();
        autores.forEach(System.out::println);
    }

    @Override
    public void listarAutoresVivosEnAño(int año) {
        List<String> autores = libroRepository.findLivingAuthorsInYear(año);
        autores.forEach(System.out::println);
    }

    @Override
    public void listarLibrosPorIdioma(String idioma) {
        List<Libro> libros = libroRepository.findByIdioma(idioma);
        libros.forEach(System.out::println);
    }
}