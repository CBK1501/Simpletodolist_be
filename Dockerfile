# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY . .

# Build the project
RUN ./mvnw package

# Run the application
CMD ["java", "-jar", "Simpletodolist.jar"]