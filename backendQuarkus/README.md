# Projeto

Este projeto usa Quarkus, the Supersonic Subatomic Java Framework.

website: https://quarkus.io/ .

## Para rodar em modo dev

```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `com.github.quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/com.github.quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executablePro

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/com.github.quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Para baixar e rodar imagem docker do mysql

docker run --network host -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=teste -d --rm mysql:8.0.19 

## Para teste de container

https://www.testcontainers.org/modules/databases/mysql/

pegar o cod em maven

apos rodar o test da junit pode dar erro

problema docker rodar comando no terminal 
sudo chmod 666 /var/run/docker.sock


