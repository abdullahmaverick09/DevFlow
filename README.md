Here is the `README.md` content.

```markdown
# DevFlow Backend 🚀

A SaaS Project Management & Issue Tracking API built with Spring Boot 4.0.2 and Java 25.

## 🛠 Tech Stack
*   **Java 25**
*   **Spring Boot 4.0.2** (Web, JPA, Validation, Actuator)
*   **PostgreSQL** (Database)
*   **Flyway** (Database Migration)
*   **Docker** (Containerization)
*   **Lombok** (Code Generation)

## 🏃‍♂️ How to Run

### 1. Prerequisites
*   Java 25 installed.
*   Docker installed.

### 2. Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/devflow-backend.git
cd devflow-backend
```

### 3. Database Setup
Start the PostgreSQL database using Docker:
```bash
docker compose up -d
```
*This creates a database named `devflow_db` with user `devflow_user` and password `devflow_password`.*

### 4. Configuration
Copy the example configuration file:
```bash
cp src/main/resources/application-example.yaml src/main/resources/application.yaml
```
*(Note: If you used the default Docker setup above, the credentials in `application-example.yaml` are already set to match. You don't need to change anything unless you want custom credentials.)*

### 5. Run the Application
```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8081`.

## 📖 API Documentation

### Projects API

**Create Project**
*   **Method:** `POST`
*   **URL:** `/api/v1/projects`
*   **Body:**
    ```json
    {
        "name": "My New Project",
        "description": "Description here"
    }
    ```

**Get All Projects**
*   **Method:** `GET`
*   **URL:** `/api/v1/projects`

---
Built with ❤️ by Abdullah Ali
```