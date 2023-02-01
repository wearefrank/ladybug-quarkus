# Demo and test Ladybug in Quarkus

Start this application like any other Quarkus application with:

```
mvnw quarkus:dev
```

Or use Java and Maven downloaded and installed by the
[Frank!Runner](https://github.com/ibissource/frank-runner#frankrunner). Edit
the cmd.bat in the frank-runner folder, change JAVA_HOME=%JDK_8_DIR% to JAVA_HOME=%JDK_11_DIR% (your change will be
overwritten again when running Frank!Runner), run cmd.bat and execute the following:

```
cd ..\ladybug-quarkus
mvnw quarkus:dev
```

And visit:

- http://localhost:8080/

If you have made changes to Ladybug and would like to use those changes in this project, you must make sure to change
the version of Ladybug inside this project's pom.xml to the SNAPSHOT version of your Ladybug project. You must restart
Quarkus after every Ladybug build that contains your new changes.

This application was initially generated as described at
https://quarkus.io/guides/getting-started#bootstrapping-the-project (see tab Maven) with:

```
mvn io.quarkus.platform:quarkus-maven-plugin:2.13.3.Final:create -DprojectGroupId=org.wearefrank -DprojectArtifactId=ladybug-quarkus -Dextensions=resteasy-reactive
```

***
The rest of this README is the same as the initially generated README by Quarkus.
***

# ladybug-quarkus Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/ladybug-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A JAX-RS implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
