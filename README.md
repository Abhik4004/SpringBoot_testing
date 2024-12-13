# Spring Boot Demo Project

This is a simple Spring Boot application that demonstrates how to create a basic REST API. The application exposes an endpoint that receives JSON data and returns a message based on the input.

## Features

- Basic Spring Boot setup
- Exposes a `POST` endpoint to receive JSON data
- Handles JSON binding and validation
- Easy to extend and integrate with a database

## Technologies Used

- **Java 17** (or later)
- **Spring Boot 3.x**
- **Maven** for dependency management
- **Postman** for testing the API

## Getting Started

Follow these steps to get a copy of the project up and running on your local machine:

### Prerequisites

- JDK 17 or later
- Maven (for building the project)
- Postman (for API testing)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-username/spring-boot-demo.git
   cd spring-boot-demo
   ```

2. **Build the application**:

   Make sure Maven is installed and use the following command to build the project:

   ```bash
   mvn clean install
   ```

3. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

   The application will start running on [http://localhost:8080](http://localhost:8080).

## API Endpoints

### `POST /students`

This endpoint receives a POST request with a Student JSON object in the body. It returns a message confirming the received data.

#### Request Example:

```json
{
  "id": 1,
  "name": "John Doe",
  "age": 20
}
```

#### Response Example:

```text
Received student with name: John Doe and age: 20
```

## How to Test

You can test the POST route using Postman or any other API testing tool:

1. Open Postman.
2. Set the request type to `POST`.
3. Set the URL to `http://localhost:8080/students`.
4. Add the header `Content-Type: application/json`.
5. In the body, select `raw` and enter the JSON data (like the example above).
6. Click `Send` to see the response.

## Running Tests

You can run unit tests and integration tests using Maven:

```bash
mvn test
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```
