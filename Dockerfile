FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} testdata.jar
ENTRYPOINT ["java","-jar","/testdata.jar"]
EXPOSE 8089
