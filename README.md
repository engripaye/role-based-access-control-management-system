# ROLE-BASED-ACCESS-CONTROL-MANAGEMENT-SYSTEM
<img width="1024" height="1024" alt="Sistema de Control de Acceso por Roles" src="https://github.com/user-attachments/assets/11277c40-7018-495c-9fac-564e4abe379d" />
[![Java Version](https://img.shields.io/badge/Java-21-blue.svg)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Build Status](https://img.shields.io/badge/build-passing-success)]()

This project will use Spring Security with OAuth2 to manage roles and protect endpoints with @PreAuthorize. 
I’ll explain each component in detail, provide a complete project structure, and include code snippets for clarity. 
The goal is to create a secure application where users with different roles (e.g., ROLE_ADMIN, ROLE_USER) can access specific endpoints based on their permissions.

## Project Overview
The application will:
Use Spring Security to handle authentication and authorization.
Implement OAuth2 with an in-memory user store for simplicity (you can extend it to use a database or external OAuth2 provider like Keycloak).
Define roles (ROLE_ADMIN, ROLE_USER) and assign them to users.
Protect API endpoints using @PreAuthorize to enforce role-based access.
Include a basic REST API with endpoints restricted to specific roles.

## ✨ Features
- 🔐 Secure authentication using Spring Security & JWT
- 👤 Role-based access for Admin, Manager, and User
- ✅ Registration & Login APIs
- 📄 Token-based access control
- 🧪 Unit and integration test structure
- 🌐 REST API with protected endpoints

## Prerequisites
Java 21 (Ensure you have a JDK installed, e.g., OpenJDK 21).
Maven or Gradle (I’ll use Maven for this example).
IDE (IntelliJ IDEA, Eclipse, or VS Code).
Basic understanding of Spring Boot and REST APIs.

rbac-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/rbacdemo/
│   │   │       ├── config/
│   │   │       │   └── SecurityConfig.java
│   │   │       ├── controller/
│   │   │       │   └── ApiController.java
│   │   │       ├── model/
│   │   │       │   └── User.java
│   │   │       ├── service/
│   │   │       │   └── UserService.java
│   │   │       └── RbacDemoApplication.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/
│           └── com/example/rbacdemo/
│               └── RbacDemoApplicationTests.java
└── pom.xml


---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven or Gradle
- Git

### Clone the Repository

```bash
git clone https://github.com/your-username/rbac-management-system.git
cd rbac-management-system

⚙️Configuration
spring:
  datasource:
    url: jdbc:h2:mem:rbacdb
    driverClassName: org.h2.Driver
    username: sa
    password:
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

jwt:
  secret: your-secret-key
  expiration: 3600000

## Conclusion
This project demonstrates a complete RBAC system using Java 21 and Spring Boot 3.5. It uses Spring Security to enforce role-based access with @PreAuthorize and supports both HTTP Basic and OAuth2 authentication. The application is extensible for production use with databases, external OAuth2 providers, and fine-grained permissions.
To run the project:

Clone the code from the structure above.
Run mvn spring-boot:run.
Test endpoints using cURL, Postman, or a browser.
Extend with OAuth2 or a database as needed.

If you have specific requirements (e.g., database integration, specific OAuth2 provider), let me know, and I can provide tailored code and explanations!
