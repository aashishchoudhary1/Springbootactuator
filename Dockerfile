FROM openjdk:8
ADD target/springbootactuator.jar springbootactuator.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springbootactuator.jar"]
