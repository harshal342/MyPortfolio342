package com.myportfolio.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPortfolioApplication.class, args);
		System.out.println("🚀 PORT from ENV = " + System.getenv("PORT"));

	}

}
/*# Build stage
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage - Use JDK instead of JRE (more reliable)
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar -Dserver.port=${PORT:-8080} app.jar"] */
