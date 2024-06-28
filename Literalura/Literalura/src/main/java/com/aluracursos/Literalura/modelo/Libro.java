package com.aluracursos.Literalura.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(unique = true)
        private String titulo;
        private String autor;
        private String idioma;
        private int añoPublicacion;

        // Getters y Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getIdioma() {
                return idioma;
        }

        public void setIdioma(String idioma) {
                this.idioma = idioma;
        }

        public int getAñoPublicacion() {
                return añoPublicacion;
        }

        public void setAñoPublicacion(int añoPublicacion) {
                this.añoPublicacion = añoPublicacion;
        }
}
