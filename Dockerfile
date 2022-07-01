FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/GitGubActionsSpringGradleProject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "GitGubActionsSpringGradleProject-0.0.1-SNAPSHOT.jar"]