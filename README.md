# cafe-inspiration-backend

1) Setup MySQL via docker:
```
docker run --name cafe-mysql -e MYSQL_ROOT_PASSWORD=<password> -d -p 9000:3306 -p 9001:33060 mysql:8.0
```

2) Setup MySQL database script:
```
CREATE DATABASE IF NOT EXISTS CAFE_INSPIRATION;

USE CAFE_INSPIRATION;

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users (
  user_id BINARY(16) PRIMARY KEY NOT NULL,
  user_name VARCHAR(32) NOT NULL,
  user_email VARCHAR(255) UNIQUE NOT NULL,
  user_password VARCHAR(128) NOT NULL,
  user_salt BINARY(16) NOT NULL
);
```
3) Change application.properties in the Java project:

```
# Spring Data JPA
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mysql://localhost:9000/CAFE_INSPIRATION
spring.datasource.username=root
spring.datasource.password=<password> 
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#spring.jpa.show-sql: true
```
