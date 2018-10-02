# Eurowings-Newsletter-Subscription
-----------------------------------
The project provides a RESTful API to manage the newsletter subscription service.

For the backend an embedded H2 Database is used. Project data is initialized upon application start-up using the resources/data.sql.

Technology Used:
- Spring Boot
- Java8
- H2 Database (In-Memory DB)
- Maven
- Swagger
- Eclipse
- Unit Testing
- Docker

Assumptions: 
-------------
- The user is allowed to take the newsletter once he is subscribed., So for the service is provide the below functionality:
  - Subscribe a user
  - Unsubscribe a user
  - Get the status (subscribed/unsubscribed) of a user. (Once he is subscribed, so he must receive the new letter)
  - list all users by status. (for the 4th point in Bonus objectives (Your newsletter is very popular): so i need to list all active users)
  - list all users subscribed before a given date.

Authentication Parameters:
--------------------------
  username:	admin
  password: 02468
  
  
Instructions:
-------------
From the source code inside any IDE: 
	- Just you only need to build the project.
	- Go to NewsletterSubscriber.java -> right click and run as Spring Boot Application.
	- Open browser and type, http://localhost:8080, then you will redirected to swagger home page.
	- You can enter your authentication info, username = admin, password = 02468.

Another way from provided Jar file.
	- Open CMD and cd to the path of the jar file.
	- Type java -jar jarfilename.jar
	- Open browser and type, http://localhost:8080, then you will redirected to swagger home page.
	- You can enter your authentication info, username = admin, password = 02468.

For docker.
	- You will find a docker file beside the jar in a folder
	- Just go to the path the jar and docker file are located
	- Then type: docker build . (It will create a docker image)
	




