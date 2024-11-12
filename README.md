Smart Business App

Smart Business App is a Spring Boot application designed to manage user authentication, roles, and business operations using RESTful APIs. It includes user authentication through JSON Web Tokens (JWT), secure role-based access control, and PostgreSQL database integration with Liquibase migrations for schema management.

Features

	•	JWT Authentication: Implements JWT for secure token-based authentication.
	•	Role-based Access Control: Supports multiple user roles with distinct permissions.
	•	REST API: Exposes RESTful endpoints for user management, authentication, and role assignments.
	•	Database Migrations: Uses Liquibase for versioned database schema migrations.
	•	Auditable Entities: Includes entity audit fields (created, updated) for tracking changes.

Technologies Used

	•	Spring Boot (Web, Data JPA, Security)
	•	PostgreSQL as the database
	•	Liquibase for database migration management
	•	Lombok for reducing boilerplate code
	•	JWT for token-based authentication
	•	Jakarta Annotations for @PostConstruct and other annotations

Project Structure

	•	model: Defines JPA entities such as User, Role, and Status along with a BaseEntity for common fields.
	•	repository: Includes JPA repositories for data access.
	•	security: Contains JWT-related components, security configuration, and custom UserDetails service.
	•	service: Implements business logic for user registration and management.
	•	rest: Exposes REST endpoints for user and role management, and authentication.

Getting Started

Prerequisites

	•	Java 17 or newer
	•	Maven for building the project
	•	PostgreSQL database

Setup

	1.	Clone the repository: 
 
		git clone https://github.com/your-username/smartbusinessapp.git
		cd smartbusinessapp

	2.	Configure PostgreSQL:

		Update application.properties with your PostgreSQL connection details:

		spring.datasource.url=jdbc:postgresql://localhost:5432/smartbusinessapp_db
		spring.datasource.username=your_db_username
		spring.datasource.password=your_db_password

	3.	Set up JWT Secret:
 
		Set the JWT secret key in application.properties:

		jwt.token.secret=your_secret_key_base64_encoded
		jwt.token.expired=3600000

API Endpoints

	•	Authentication:
	•	POST /api/v1/auth/login: User login with JWT token generation.
	•	User Management:
	•	GET /api/v1/users/{id}: Retrieve user information by ID (requires authentication).
	•	Admin Functions:
	•	GET /api/v1/admin/users/{id}: Access user information (admin-only access).

Database Migrations

This project uses Liquibase for managing database schema changes. Ensure the liquibase properties in application.properties are configured correctly for your environment.

Security

The application uses Spring Security with JWT for token-based authentication. Authorization is enforced based on roles, such as ROLE_USER and ROLE_ADMIN.
 
