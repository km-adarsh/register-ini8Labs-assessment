# Registration Project README

## Introduction
This README provides detailed instructions for downloading, setting up, and running the Registration project, which includes CRUD operations built using the Spring Boot framework. The project utilizes Maven for dependency management and MySQL as the database.

This project primarily focuses on demonstrating CRUD operations without extensive design elements. It is intentionally kept simple to highlight the functionality of Spring Boot and JPA. 

As there were no specific design requirements, Spring JPA is utilized. Spring JPA simplifies data access by automatically generating tables and columns based on annotations in the entity classes. This approach eliminates the need for manual table creation and allows for rapid development of database-backed applications.

## Prerequisites
- Java Development Kit (JDK) installed on your system
- Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
- Maven installed
- MySQL Database Management System (DBMS) installed, like MySQL Workbench

## Downloading the Project
1. Navigate to the GitHub repository containing the Registration project.
2. Clone or download the repository to your local system.

## Importing the Project into IDE
1. Open your IDE (Eclipse or IntelliJ IDEA).
2. Import the project as a Maven project:
   - In Eclipse, navigate to `File` > `Import...` > `Maven` > `Existing Maven Projects`. Then, select the root directory of the downloaded project.
   - In IntelliJ IDEA, select `Import Project`, then choose the root directory of the downloaded project and select `Maven`.

## Updating Project Dependencies
1. Once the project is imported, right-click on the project folder.
2. Navigate to `Maven` > `Update Project...`.
3. Select the option to force update snapshots/releases and click `OK`.

## Setting up the Database
1. Open MySQL Workbench or any other MySQL client.
2. Create a new database named `registration`.
3. Update the database configuration details in the `application.properties` file located in the project's resources directory. Set the appropriate values for `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` according to your MySQL setup.

## Running the Project
1. In your IDE, right-click on the project folder.
2. Select `Run As` > `Java Application`.
3. Once the application is running, open a web browser.
4. Navigate to `localhost:{portNumber}` in the address bar, replacing `{portNumber}` with the port specified in the application properties or default port `8080`.

- The application should now be accessible, allowing you to perform CRUD operations on the registration system through the provided endpoints.

