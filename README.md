# Movie REST API

A simple Java Spring Boot backend application that provides RESTful APIs
to manage a collection of movies using in-memory storage.

## Technologies Used
- Java 17
- Spring Boot
- Maven
- REST API
- In-memory ArrayList

## How to Run
1. Clone the repository
2. Run `mvn clean install`
3. Run `mvn spring-boot:run`
4. Application runs on `http://localhost:8080`

## API Endpoints

### Add Movie
POST `/api/movies`

Request Body:
```json
{
  "name": "Inception",
  "description": "A science fiction thriller",
  "genre": "Sci-Fi",
  "releaseYear": 2010
}
