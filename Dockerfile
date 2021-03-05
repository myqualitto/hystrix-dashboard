FROM openjdk:8
EXPOSE 9095
ADD target/techhmr-hystrixdashboard.jar techhmr-hystrixdashboard.jar
ENTRYPOINT ["java","-jar","/techhmr-hystrixdashboard.jar"]