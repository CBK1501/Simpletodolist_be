# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY . .

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the project using Maven
RUN mvn package

# Run the application
CMD ["java", "-jar", "target/your-app-name.jar"]
