# Project Overview

This is an ongoing full-stack project designed to integrate a **Spring Boot** backend with a **React.js** frontend. The purpose of this project is to learn and implement modern web development practices, focusing on integrating React.js with Spring Boot, JWT-based authentication, and cloud deployment.

![Frontend](hotel.gif)
---

## Tech Stack

### Backend
- **Spring Boot** - For building the RESTful APIs.
- **JWT (JSON Web Token)** - For secure authentication and authorization.
- **AWS** - For deployment and hosting.
- **MySQL** - As the relational database.

### Frontend
- **React.js** - For building the user interface.

---

## Learning Resource
This project is based on the tutorial video:
[Integrating React.js with Spring Boot](https://youtu.be/J71tNe8O1GA?si=SkYmKEeppH8VWTRa)

The tutorial was used as a foundation to:
- Understand how to set up a backend with Spring Boot.
- Learn React.js frontend integration with the Spring Boot API.
- Implement secure authentication using JWT.

---

## Project Status
**Ongoing**: The project is a work in progress, with further development and improvements planned.

---

## Goals
- Successfully integrate React.js frontend with Spring Boot backend.
- Implement secure login and token-based authentication using JWT.
- Host the application on AWS for cloud deployment.
- Establish MySQL as the backend database.

---

## How to Run the Project

### Prerequisites:
- Java Development Kit (JDK 17 or above)
- Node.js (latest version)
- MySQL database
- AWS account for deployment

### Steps:
1. **Backend** (Spring Boot):
   - Clone the backend repository.
   - Configure `application.properties` to connect to your MySQL database.
   - Run the Spring Boot application using your IDE or `mvn spring-boot:run`.

2. **Frontend** (React.js):
   - Clone the frontend repository.
   - Install dependencies with `npm install`.
   - Run the development server using `npm start`.

3. Access the application at `http://localhost:3000` (React.js frontend) and ensure it connects to the Spring Boot backend running on `http://localhost:8080`.

---

## Future Improvements
- Add full CRUD operations.
- Implement role-based authentication.
- Improve frontend UI/UX.
- Add testing for both frontend and backend.
- Deploy the final application to AWS Elastic Beanstalk.

---

## Acknowledgment
- Special thanks to [this tutorial](https://youtu.be/J71tNe8O1GA?si=SkYmKEeppH8VWTRa) for guidance and learning.

