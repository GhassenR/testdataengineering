FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} testdataengineering.jar
ENTRYPOINT ["java","-jar","/testdataengineering.jar"]
EXPOSE 8089
