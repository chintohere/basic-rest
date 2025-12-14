FROM openjdk:25-ea
WORKDIR /app
COPY build/libs/*.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]
