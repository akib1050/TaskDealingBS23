# TaskDealingBS23

# # Installation Guide

Hi! I'm your first Markdown file in **StackEdit**. If you want to learn about StackEdit, you can read me. If you want to play with Markdown, you can edit me. Once you have finished with me, you can create new files by opening the **file explorer** on the left corner of the navigation bar.

Following version of the software/tools were used in developing this project:

1.  JDK 21
2.  H2 Database
3.  Spring Boot 3.2.2

Follow the instruction below for installation:

1.  Scema will created and save the data ar H2 database
2.  Clone the repository.
3.  All details will find in  _**application.properties**_:
4. Build the Project
5. Run the project


# API used

GET, POST, DELETE
(All the End Points are with a comment in the Code)

## API Documentation



|            End Point    |Value Recieved                          |                      |
|----------------|-------------------------------|--------|
|/localhost:8090/admin|`'Admin Home'`            |          |
|/admin/categories      |`"All the Tasks"`      |          |
|/register        |`register page`| (Won't Work for now)
|/login 		| `login page` |(Won't Work for now)


## Description

This is my very first Spring Boot Application and in it I have used spring framework and spring boot. I used both Spring Boot and Spring Framework in this, my first Spring Boot application. After completing the steps, the programme will launch and the admin portal will be visible. Since this is my first project, I am the only one who can handle task creation, deletion, updating, and addition. I was able to use an H2 database to bring the data and store it. You can still Create, Retrieval, Update, and Delete using the REST end points, but the design of the Login and Registration page is "Done," even though I was unable to establish a connection with the H2 database. For this reason, I have left the code in place and commented it out. 



## ScreenShot
![Manage Task Portal](https://github.com/akib1050/TaskDealingBS23/blob/main/admin.JPG)
![Submit A task](https://github.com/akib1050/TaskDealingBS23/blob/main/submit%20New%20task.JPG)
![Add Tassk](https://github.com/akib1050/TaskDealingBS23/blob/main/add%20task%20&%20update.JPG)![Delete Task Portal](https://github.com/akib1050/TaskDealingBS23/blob/main/delete%20task.JPG)

