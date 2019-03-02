FROM openjdk:8-alpine

COPY target/uberjar/conduit.jar /conduit/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/conduit/app.jar"]
