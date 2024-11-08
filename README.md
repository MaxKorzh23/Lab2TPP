# Spring Boot Calculator Application

This project is a simple Spring Boot web application that provides a calculator to evaluate mathematical expressions directly in a web browser. It uses the [MathParser.org-mXparser](http://mathparser.org/) library for parsing and calculating expressions, and Thymeleaf for rendering HTML templates.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Requirements](#requirements)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Testing](#testing)
- [License](#license)

## Overview

The calculator application provides a user-friendly interface where users can enter any mathematical expression, and upon submitting, the result is displayed on the same page. This application demonstrates basic Spring Boot functionality, including controller creation, dependency injection, and the use of HTML and CSS for front-end rendering.

## Project Structure

The project contains the following key files:

- **Application.java**: The main entry point for the Spring Boot application.
- **CalculatorController.java**: A Spring MVC controller to handle calculator operations.
- **calculator.html**: Thymeleaf HTML template for the calculator user interface.
- **styles.css**: CSS file for styling the HTML page.

## Requirements

To run this project, you need:

- **Java 17** or higher
- **Maven** 3.6.0 or higher
- **Docker** (optional, for containerized deployment)

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/andrux2410/TPP_LABS.git
   cd TPP_LABS/
   
2. Build the project using Maven:

```bash
mvn clean install
```

## Running the Application

To start the application, you have a few options:

**Option 1: Running Locally with Maven**

You can run the application directly from Maven by executing:

```bash
mvn spring-boot:run
```

Once started, the application will be available at http://localhost:8080/.

**Option 2: Running with Docker**

If Docker is installed, you can build and run a Docker container for this application:

Build the Docker image:

```bash
docker build -t calculator-app .
```

Run the Docker container:

```bash
docker run -p 8080:8080 calculator-app
```

The application will be available at http://localhost:8080/.

## Usage

Navigate to http://localhost:8080/ in your browser.
Enter a mathematical expression in the input field (e.g., 2+3*5).
Click the Calculate button.
The result will be displayed below the input field.

## Example Expressions

- **Addition: 7 + 2**

- **Subtraction: 8 - 3**

- **Multiplication: 2 * 7**

- **Division: 12 / 3**

- **Complex Expression: (5 + 8) * 5 - 10**

## Testing

The application includes unit tests to ensure functionality. To run the tests, use:

```bash
mvn test
```

The results will be available in the console and in the target/surefire-reports directory.

## License

This project is licensed under the Apache 2.0 License - see the LICENSE file for details.
