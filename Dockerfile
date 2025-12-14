FROM openjdk:25-ea AS build
WORKDIR /app
COPY . .
RUN microdnf install -y findutils
RUN ./gradlew build -x test && rm -f build/libs/*-plain*

FROM openjdk:25-ea
WORKDIR /app
COPY --from=build /app/build/libs/*.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]
