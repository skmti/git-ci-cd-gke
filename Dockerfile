# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim as build

# Set the working directory
WORKDIR /app

# Copy the JAR file built by Maven
COPY target/test-deploy-cicd-gke-0.0.1-SNAPSHOT.jar /app/test-deploy-cicd-gke-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app/test-deploy-cicd-gke-0.0.1-snapshot.jar"]

# Expose port 8080
EXPOSE 8080
