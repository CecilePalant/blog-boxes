FROM maven:3-openjdk-18-slim as BUILD

COPY . /src
WORKDIR /src
RUN mvn clean install -DskipTests

FROM openjdk:18

COPY ./target/consoleApp-1.0-SNAPSHOT-jar-with-dependencies.jar /bin/runner/run.jar
WORKDIR /bin/runner

CMD ["java","-jar","run.jar"]