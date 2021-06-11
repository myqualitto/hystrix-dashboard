FROM openjdk:8-jdk-alpine
EXPOSE 8888
COPY target/*.jar hystrix-dashboard.jar
ENTRYPOINT ["java","-jar","/hystrix-dashboard.jar"]
