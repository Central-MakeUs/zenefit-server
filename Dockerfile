FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=dev","/app.jar"]