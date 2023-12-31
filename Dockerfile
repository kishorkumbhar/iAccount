FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim
RUN apk update && apk add bash
WORKDIR /app
COPY /target/Account-Demo.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Account-Demo.jar"]
