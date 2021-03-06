# For Java 8, try this
FROM openjdk:8

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/football-league-gyan.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/football-league-gyan.jar /opt/app/football-league-gyan.jar
COPY ${JAR_FILE} football-league-gyan.jar
EXPOSE 8085
# java -jar /opt/app/football-league-abansal.ja241dff5fa202r
ENTRYPOINT ["java","-jar","football-league-gyan.jar"]
# sudo docker build -t spring-boot:1.0 .
# sudo docker run -d -p 8085:8085 -t spring-boot:1.0
