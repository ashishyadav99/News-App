FROM openjdk:18-jdk
WORKDIR usr/src
ENV MYSQL_DATABASE userDb
ENV MYSQL_USER root
ENV MYSQL_PASSWORD arushi123
ENV MYSQL_CI_URL jdbc:mysql://localhost:3306/userDb
ADD ./target/UserService-0.0.1-SNAPSHOT.jar usr/src/UserService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","usr/src/UserService-0.0.1-SNAPSHOT.jar"]