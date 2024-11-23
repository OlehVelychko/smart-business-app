# Smart Business App

Smart Business App is a full-stack application designed to streamline user authentication, role management, and business operations. Built with a **Spring Boot backend** and a **React-based frontend**, the project features secure role-based access control, RESTful APIs, and a robust PostgreSQL database integrated with Liquibase for schema management.

---

## **Features**

### Backend Features
- **JWT Authentication**: Secure, token-based user authentication.
- **Role-Based Access Control**: Supports multiple roles like `ROLE_USER` and `ROLE_ADMIN`, with distinct permissions.
- **REST API**: Provides endpoints for user management, authentication, and role assignment.
- **Database Migrations**: Utilizes Liquibase for versioned schema migrations.
- **Auditable Entities**: Tracks changes with `created` and `updated` timestamps.

### Frontend Features
- **React UI**: A responsive and modern user interface.
- **Routing**: Implements React Router for seamless navigation.
- **State Management**: Uses Redux for predictable state handling.
- **Styled Components**: Customizable styles using CSS-in-JS.
- **Material-UI**: Consistent design with pre-built components.

---

## **Technologies Used**

### Backend
- **Spring Boot**: Web, Data JPA, Security.
- **PostgreSQL**: Relational database.
- **Liquibase**: Database migration management.
- **Lombok**: Reduces boilerplate code.
- **JWT**: Token-based authentication.
- **Jakarta Annotations**: For lifecycle management.

### Frontend
- **React**: Component-based UI library.
- **Redux**: State management.
- **Styled Components**: CSS-in-JS library for dynamic styling.
- **Material-UI**: UI component library.
- **Vite**: Fast build tool and development server.
- **TypeScript**: Typed JavaScript for scalable development.

---

## **Project Structure**

### Backend
- **model/**: JPA entities such as `User`, `Role`, and `Status`. Includes `BaseEntity` for common fields.
- **repository/**: JPA repositories for data access.
- **security/**: JWT components, security configuration, and custom `UserDetailsService`.
- **service/**: Business logic for user registration and management.
- **rest/**: RESTful controllers for user, role, and authentication endpoints.

### Frontend
- **public/**: Static assets like icons and fonts.
- **src/**
  - **components/**: Reusable React components.
  - **pages/**: Page-specific components (e.g., `Home`, `Login`).
  - **styles/**: Global and theme-based styling.
  - **App.tsx**: Root React component.
  - **main.tsx**: Application entry point.

---

## **Getting Started**

### Prerequisites
- **Backend**: Java 17+, Maven, PostgreSQL.
- **Frontend**: Node.js (v16 or newer) and npm.
