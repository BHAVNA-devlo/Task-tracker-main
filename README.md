# Task Tracker – Spring Boot Application

A Spring Boot–based task tracker application that provides RESTful APIs to create, update, and manage tasks, helping users organize their workflow efficiently.

---

## 🚀 Features
- Create new tasks
- Update existing tasks
- Mark tasks as completed or pending
- Delete tasks
- View all tasks
- RESTful API architecture

---

## 🛠️ Tech Stack
- **Backend:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **Database:** MySQL / H2 (based on configuration)
- **ORM:** JPA / Hibernate
- **API Testing:** Postman

---

## 📂 Project Structure
src/main/java
└── com.example.tasktracker
├── controller
├── service
├── repository
└── model

---

## ⚙️ Setup & Run Instructions

### Prerequisites
- Java 17+ (or Java 11)
- Maven
- IDE (IntelliJ IDEA / Eclipse / VS Code)

### Steps to Run
1. Clone the repository
   ```bash
   git clone https://github.com/your-username/task-tracker.git
cd task-tracker
mvn spring-boot:run
http://localhost:8080
🔗 API Endpoints (Sample)
Method	Endpoint	Description
POST	/tasks	Create a new task
GET	/tasks	Get all tasks
PUT	/tasks/{id}	Update a task
DELETE	/tasks/{id}	Delete a task

🧠 Learning Outcomes

Hands-on experience with Spring Boot

REST API design

CRUD operations using JPA/Hibernate

Backend application architecture

API testing using Postman


👩‍💻 Author

Bhavna Singh
B.Tech CSE (AI) Student
