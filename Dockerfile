#FROM openjdk:latest
#COPY ./target/seMethods-0.1.0.4-jar-with-dependencies.jar /tmp
#WORKDIR /tmp
#ENTRYPOINT ["java", "-jar", "seMethods-0.1.0.4-jar-with-dependencies.jar"]

FROM openjdk:latest
COPY ./target/seMethods.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods.jar", "db:3306"]