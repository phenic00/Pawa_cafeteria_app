# Name of the Project
PAWA Cafeteria Food App

# TEAM MEMBERS
-Phenic Otwori
-Omar Aden
-Idah Gacheri
-Samuel Greg
-Violet Wandaho


## Description of Project
This App allows staff to order a scrumptious meal
## Technologies Used
- Java
- GIT and GITHUB
- PostgreSQL(dbeaver/data grip/dbdiagram.io)
- IntelliJIDEA
- Java Script
- CSS
- HTML

## Complete Setup Instructions
- Git clone https://github.com/phenic00/Pawa_cafeteria_app
- Open the cloned Code on Vs Code
- DB Setup Instructions:
- CREATE TABLE "category" (
  "id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "name" varchar
  );

CREATE TABLE "productcategory" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"category_id" int,
"product_id" int
);

CREATE TABLE "product" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"name" varchar,
"description" varchar,
"price" int
);

CREATE TABLE "orderitem" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"productcategory_id" int,
"quantity" int,
"order" int
);

CREATE TABLE "order" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"user_id" int,
"status" varchar,
"user" varchar
);

CREATE TABLE "payment" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"order" int,
"paymentmethod" varchar,
"amount" int,
"paymentdetail" varchar
);

CREATE TABLE "user" (
"id" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
"email" varchar,
"password" varchar,
"typeofuser" varchar
);
## BDD

- Login
- View the Tasty offerings by Category
- Make an order
- Make a Payment
- Check status of the order

## TDD
- Test the features
## Known Bugs
No known bugs
## Licence information with a copyright and date
(c) 2023 Group 4 Safaricom Digital Academy Cohort 4