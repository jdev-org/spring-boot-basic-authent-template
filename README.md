# /spring-boot-basic-authent-template

This is a template to start with Spring Boot security basic authent.

## Prerequisites

- Java 17
- maven
- Spring 3.2.4

## Install & start service
1. clone & install

```
git clone https://github.com/jdev-org/spring-boot-basic-authent-template.git
cd spring-boot-basic-authent-template
mvn clean install -DskipTests
```

2. Start service :

```
java -jar ./target/basic-authent-template-0.0.1-SNAPSHOT.jar
```

Service works by default on `localhost:8094` with user `user` and password `password`.
Change these values from `application.properties` file.

## Use it

Try request from CURL command or Postman Client : 

GET - localhost:8094/hello
POST - localhost:8094/foo

With Postman, add basic authent informations in Authorization tab :

![image](https://github.com/jdev-org/spring-boot-basic-authent-template/assets/16317988/acd5b6b1-e167-44ca-b0fc-ad96d3bd99a4)
