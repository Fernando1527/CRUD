# Biblioteca App

Biblioteca App es una aplicación para la gestión de libros, donde los usuarios pueden agregar, editar y eliminar libros junto con sus respectivos autores. La aplicación está desarrollada con una arquitectura full-stack utilizando Java Spring Boot para el backend, MySQL como base de datos y Angular para el frontend.

## Tecnologías utilizadas

- **Backend**: Java con Spring Boot
- **Base de datos**: MySQL
- **Frontend**: Angular

## Características

- Agregar libros con sus autores.
- Editar información de los libros y autores.
- Eliminar libros de la biblioteca.
- Listar los libros registrados en la biblioteca.

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes programas:

- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)
- [Node.js](https://nodejs.org/) y [Angular CLI](https://angular.io/cli)

## Instalación y ejecución

### Backend
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/biblioteca-app.git
   ```
2. Accede al directorio del backend:
   ```bash
   cd backend
   ```
3. Configura la conexión a MySQL en el archivo `application.properties` o `application.yml`.
4. Ejecuta el backend con Maven:
   ```bash
   mvn spring-boot:run
   ```

### Base de datos
1. Crea la base de datos en MySQL:
   ```sql
   CREATE DATABASE biblioteca;
   ```
2. Asegúrate de configurar el usuario y contraseña en `application.properties`.
3. Ejecuta las migraciones si es necesario.

### Frontend
1. Accede al directorio del frontend:
   ```bash
   cd frontend
   ```
2. Instala las dependencias:
   ```bash
   npm install
   ```
3. Ejecuta la aplicación Angular:
   ```bash
   ng serve
   ```
4. Abre el navegador en `http://localhost:4200` para ver la aplicación.

## Contribución
Si deseas contribuir, por favor realiza un fork del repositorio y crea un pull request con tus mejoras.

## Licencia
Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo `LICENSE`.

---
Desarrollado por [Fernando Abrego].

