Working link : https://realtime-crypto-tracker.onrender.com/
# 🚀 Realtime Crypto Tracker

A web application that allows users to track cryptocurrency prices and view relevant cryptocurrency information in real time.

The application is built using **Java** and **Spring Boot**, with **Thymeleaf** for server-side rendering.

## 📌 Features

* 📈 Track cryptocurrency prices
* 🔍 Search for cryptocurrency information
* 💰 View cryptocurrency price details
* 🌐 Fetch live cryptocurrency data from an external API
* ⚡ Server-side rendered web interface
* 🖥️ Simple and responsive user interface

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC

### Frontend

* HTML
* CSS
* Thymeleaf

### Build Tool

* Maven

### Deployment

* Docker
* Render

## 📂 Project Structure

```text
Realtime-Crypto-Tracker/
│
└── CryptoTracker/
    ├── Dockerfile
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    │
    └── src/
        ├── main/
        │   ├── java/
        │   │   └── com/
        │   │       └── CryptoTracker/
        │   │           ├── CryptoTrackerApplication.java
        │   │           ├── CryptoController/
        │   │           ├── CryptoService/
        │   │           └── model/
        │   │
        │   └── resources/
        │       ├── application.properties
        │       └── templates/
        │           ├── index.html
        │           └── result.html
        │
        └── test/
```

## ⚙️ Installation and Setup

### 1. Clone the repository

```bash
git clone https://github.com/Piyush6770/Realtime-Crypto-Tracker.git
```

### 2. Navigate to the project directory

```bash
cd Realtime-Crypto-Tracker/CryptoTracker
```

### 3. Run the application

#### Linux / macOS

```bash
./mvnw spring-boot:run
```

#### Windows

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## 🐳 Docker

The application can be containerized using Docker.

### Build the Docker image

```bash
docker build -t crypto-tracker .
```

### Run the Docker container

```bash
docker run -p 8080:8080 crypto-tracker
```

Then open:

```text
http://localhost:8080
```

## ☁️ Deployment

The application is configured for deployment using **Docker** and **Render**.

### Deployment Flow

```text
GitHub Repository
        ↓
Docker
        ↓
Render
        ↓
Spring Boot Application
        ↓
Public Web URL
```

The application uses the following port configuration:

```properties
server.port=${PORT:8080}
```

This allows the application to run locally on port `8080` and automatically use the port provided by the deployment environment.

## 🧠 How It Works

1. The user opens the application.
2. The user searches for a cryptocurrency.
3. The request is handled by the Spring Boot controller.
4. The service communicates with an external cryptocurrency data source.
5. Cryptocurrency data is processed and mapped to the application model.
6. The results are rendered dynamically using Thymeleaf.
7. The user receives the requested cryptocurrency information.

```text
User
  ↓
Thymeleaf UI
  ↓
Spring Boot Controller
  ↓
Crypto Service
  ↓
External Crypto API
  ↓
Process Data
  ↓
Display Results
```

## 🔧 Environment Configuration

The application is configured to use the environment's port when deployed:

```properties
spring.application.name=CryptoTracker
server.port=${PORT:8080}
```

## 👨‍💻 Author

**Piyush Patel**

* GitHub: https://github.com/Piyush6770

## 📄 License

This project is currently intended for educational and portfolio purposes.

---

⭐ If you found this project useful, consider giving the repository a star!
