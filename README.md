# Sp6_SB3_Certification_resful_webservice

# enter to container
docker exec -it mysqldb bash

# autenticate to db server
mysql -u root -p

# some commands
show databases
use db_name
show tables

# some sqls
select * from users

# run Spring Boot Application
docker run --network spring-boot-mysql --name springboot-mysql-container -p 8080:8080 -d springboot-restful-webservices

# run DB MySQL
docker run --name mysqldb --network springboot-mysql-net -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=employeedb -d mysql

############################################# 
#######      DOCKER COMPOSE       ##########
#############################################

# raise docker-compose, if you use --build is to compile images from Dockerfile
docker compose up --build

# shutdown all containers
docker compose down
