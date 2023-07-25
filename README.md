# Spring Boot 3 Thymeleaf Real-Time Web Application
## Overview
The application showcases various features of Spring Boot and Thymeleaf, providing dynamic web page generation and user authentication.

## Project Highlights
The BlogApp project, developed during the course, stands as a testament to my newfound skills in Spring Boot and Thymeleaf. Some of its highlights include:

- User-friendly blog application interface using Bootstrap CSS and Thymeleaf MVC.
- Implementation of two roles, ROLE_ADMIN and ROLE_GUEST, to manage posts and comments.
- Configuring a Many-to-Many relationship between USERS and ROLES using a joining table (user_roles).
- Establishing a one-to-many relationship between posts and comments for user interaction.
- Integration of CKEditor 5 for multimedia-rich content creation.
- Utilization of @Validation for form handling, ensuring data input adheres to specified rules and constraints for a more robust and secure application.
- Enabling secure user authentication and authorization using Spring Security, granting access to specific endpoints based on user roles.
## 1) Login Page:
### Displays an invalid username/password :
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/2a7dc231-d4c9-4751-bcac-a43a3fab75b4">

### A logged in User's page:
<img width="660" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/3acee9fb-57a0-4508-a9ed-28c9b50948f4">

<strong>Note: The ROLE_ADMIN user has the access to delete/update/view any ROLE_GUEST users comments and posts.</strong> 

## 2) Registeration Page:
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/ec2b3d40-e209-4d47-b3e4-a1a1574d783e">
<br><br>
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/7b1c8a7b-b447-496e-8356-7864a7f7b6b7">

### Password get's stored in a hashed value using BCrypt Algorithm:
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/41c12706-b84c-4a11-8843-70d33cc2316c">


## 3)Creating a New Post:
<img width="600" alt="image 1" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/242d5e2d-652a-4f21-b810-49e9a0149063">
<br><br>
<img width="600" alt="image 2" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/13a464af-364f-45f6-b3e1-422d43960cd9">

### Creating a Post's Validation Part:
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/bb10d1f1-4cfb-4e93-8489-d0eab6a625df">


## 4) Comment Section:
#### Comment Validation Part:
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/52b03464-0111-4d3b-8c81-4c3f92fa0d3c">
<br>

#### Once someone writes a comment :
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/f457432a-64a8-4c52-b957-bf68038811ef">

## 5) An unauthorized user can view the Blogs:
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/78a4a90b-1c94-4d7b-bb88-cc0ae36596e6">
<br><br>
<img width="600" alt="image" src="https://github.com/harshdeepkalita/Spring-Blog-Project/assets/96279045/ad46f838-e18f-49ea-ad31-dbd6ef393f20">
