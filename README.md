# Basic REST API

A Spring Boot REST API playground project using JTE templates.

## Prerequisites

- Java 25 (JDK)
- Docker & Docker Compose

## Development

### Running Locally (with hot reload)

```bash
./gradlew bootRun
```

Access at: http://localhost:8080/hello?name=YourName

JTE templates will hot-reload automatically when `gg.jte.developmentMode=true` is set.

### Running with Docker

1. **Build the application:**
   ```bash
   ./gradlew build -x test
   ```

2. **Start Docker container:**
   ```bash
   docker compose up --build
   ```

Access at: http://localhost:8080/hello?name=YourName

## Project Structure

- `src/main/java/` - Java source code
- `src/main/jte/` - JTE templates
- `src/main/resources/application.properties` - Configuration

## Configuration

See `application.properties` for JTE and Spring Boot settings.

- **Development mode**: `gg.jte.developmentMode=true` (hot reload)
- **Production mode**: `gg.jte.usePrecompiledTemplates=true` (pre-compiled templates)
