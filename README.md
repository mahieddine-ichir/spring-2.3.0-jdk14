# Description

A Sample project with Spring 2.3.0 and JDK 14.

## Endpoints
* `/spring23/persons`, `spring23/persons?gender=male|female`,
* `/spring23/actuator`, `/spring23/actuator/health`, ... etc

## Building jar package
````
    mvn clean install
````

## Build docker image (need to have docker engine running)
````
    mvn package -Pdocker
````

## Run docker image
````
    docker run -e "JAVA_OPTS=--enable-preview" -p 8080:8080 spring-23:0.0.1-SNAPSHOT
````
