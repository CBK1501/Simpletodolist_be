# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY . .

# Give execution permission to the Maven wrapper
RUN chmod +x ./mvnw

# Build the project
RUN ./mvnw package

# Run the application
CMD ["java", "-jar", "target/your-app-name.jar"]
