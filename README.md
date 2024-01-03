
# E-Shoppe

  An online shop for our partner company EasyShop.

## Table of Contents

1. [Description](#Description)
2. [Features](#features)
3. [User Guide](#UserGuide)
4. [ER Diagram](#ERDiagram)
5. [References](#References)
6. [Acknowledgments](#Ackknowledgments)


## Description

   This application is an online shop for our partner company named EasyShop.
   

## Features

  - Displays all products.
  - Displays products based on selected category, color, or prices.
  - Allows the user to login.
  - Allows admin to create, read, update and delete products or categories.


## User Guide

  _INSTALLATION_
    
  To install this application, you will need to use IntelliJ and MySQL Workbench. Follow [this link](https://github.com/ScripttKitty/E-Shoppe) and copy the link under the <> Code drop down menu
    to choose an installation method. Copy the repo onto your machine locally, and open using IntelliJ. 
    The database is located under the *database* folder in the project. Then open MySQL workbench under your root account, create a new SQL tab for executing queries, and paste the copied database. Click 
    execute all, and a new schema will appear.
    Connect your database to intelliJ using a MySql Workbench profile with limited access to users and full admin setting for admin users. This setting is located under the *resources* directory in the 
    application.properties file. Update the file with your username and password of the chosen account from MySql Workbench.
    Lastly, open the *Capstone-client-web-application* project in a seperate window.
    
    
  _AFTER INSTALLATION_
  
    You can open the website by running the project in intelliJ, open the index file in the Capstone-client-web-applicatio, and click on the top right logo of your broswer. 
    The website is run under your http://localhost:8080/ link. From there you can freely choose which product filters to use and log in.



## ER Diagram

  Here is an ER diagram of the EasyShop Database:
  
  ![database](https://github.com/ScripttKitty/E-Shoppe/assets/89672262/f219735d-8fab-421e-90bf-5203616ad1b8)





## References

 
 - Paul’s github:
   
 [Foreign Key Ex](https://github.com/pek-ia/java-syntax-examples/blob/main/jdbc-database-metadata/src/main/java/ForeignKeyExample.java)
 [NorthwindTradersAPI](https://github.com/pek-ia/NorthwindTradersAPI)
   
 - Spring.io : [Spring Boot](https://spring.io/projects/spring-boot/#learn)
  
 - Postman Beginners Video: [API Testing](https://www.youtube.com/watch?v=VywxIQ2ZXw4) 
  
 - Workbook 9: [REST and SpringBoot](https://app.schoology.com/course/6948302025/materials/gp/6948302730)
  
 - Chat GPT: 
  
       - Explaining a few lines of code 
       - Writing a test for my search method that I didn't use



### Acknowledgments

1. Paul for helping explain issues with Postman and helping me fix my code logic.
2. Christian, Sahara, and Omar for helping with some try-catch blocks.


 




