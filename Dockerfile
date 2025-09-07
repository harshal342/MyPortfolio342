# Use Java 17
FROM eclipse-temurin:17-jdk-focal

# Set working directory
WORKDIR /app

# Copy the JAR file you built in STS
COPY target/*.jar app.jar

# Expose port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]