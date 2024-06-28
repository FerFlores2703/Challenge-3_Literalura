# Challenge-3_Literalura
# Literalura

Literalura es una aplicación de consola desarrollada en Java utilizando Spring Boot. El objetivo del proyecto es proporcionar un catálogo de libros interactivo donde los usuarios pueden buscar y listar libros y autores utilizando datos obtenidos de la API de Gutendex.

## Requisitos

- Java 17 o superior
- Maven 3.6.3 o superior
- PostgreSQL 13 o superior

## Instalación

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/tu_usuario/Literalura.git
   cd Literalura
   Configura la base de datos PostgreSQL:

2. Crea una base de datos llamada literalura.

Configura las credenciales de acceso a la base de datos en el archivo src/main/resources/application.properties:

3. Compila y ejecuta la aplicación:

 ## Uso
Al iniciar la aplicación, se mostrará un menú con las siguientes opciones:

Buscar libro por título: Permite buscar libros por su título utilizando la API de Gutendex.
Listar libros registrados: Muestra una lista de los libros que han sido registrados en la base de datos.
Listar autores registrados: Muestra una lista de los autores que han sido registrados en la base de datos.
Listar autores vivos en un determinado año: Permite listar autores que estaban vivos en un año específico.
Listar libros por idioma: Permite listar libros según su idioma.
Salir: Finaliza la aplicación.
