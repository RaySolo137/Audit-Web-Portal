FROM openjdk:8
ADD target/audit-web.war audit-web.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/audit-web.war"]