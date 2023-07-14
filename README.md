# spring-boot-learner
Project created to revise Spring topics and identify best practices while doing so

## Database setup before running the Spring Boot project

As it currently stands, the PostgreSQL database used by our application would have to be created prior to running the Spring Boot application. Assuming you are running the PostgreSQL via the provided docker-compose file, database can be created using the below commands run in the project root.

```
docker-compose up -d
docker exec -it postgres bash
psql -U atif
CREATE DATABASE book;
```
