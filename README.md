# Reservation 💻
Aplicacion web en Java con Spring Boot y base de datos PostgreSQL.

# Proyecto 🛠️
* Esta dedicado a un entorno de producción. ✔️
* Tiene codificado la contraseña para poder ingresar a la pagina. ✔️
* Tiene configurado el mapeo de rutas y accesos a las distintas pantallas. ✔️
* Se aprovecho de las caracteristicas de Lombok para los getters y setters. ✔️
* Versión de Java 11 ✔️
* Versión de PostgreSQL 10.12 ✔️
* Tambien se publicara en docker hub. 

# Open source 💚
* Eres bienvenido para aportar tu código o ayudar a mejorar lo que ya se tiene codificado. 

# Creando la bd en PostgreSQL 🐘
CREATE USER reservation WITH PASSWORD 'MANAGER1';

ALTER ROLE reservation WITH LOGIN;

ALTER ROLE reservation WITH CREATEDB;

CREATE DATABASE reservation WITH OWNER reservation;

### Conectarse a la base de datos
psql -h localhost -p 5432 -U reservation
### Creando el esquema para la base de datos
* Despues de conectarnos debemos crear un esquema para la base de datos, esto debido a que no es aconsejable usar el por defecto que proporciona PostgreSQL, con su esquema publico.

CREATE SCHEMA reservation;

SET SEARCH_PATH TO reservation;

* Para listar los esquemas podemos ejecutar el comando: \dn
