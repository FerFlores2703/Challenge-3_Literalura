package com.aluracursos.Literalura.repositorio;

import com.aluracursos.Literalura.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query("SELECT DISTINCT l.autor FROM Libro l")
    List<String> findAllAuthors();

    @Query("SELECT DISTINCT l.autor FROM Libro l WHERE l.añoNacimiento <= :año AND (l.añoMuerte IS NULL OR l.añoMuerte > :año)")
    List<String> findLivingAuthorsInYear(int año);

    List<Libro> findByIdioma(String idioma);
}