FROM openjdk:8
ADD target/audit-web.jar audit-web.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/audit-web.jar"]