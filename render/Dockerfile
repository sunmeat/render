# Используем JDK 23
FROM openjdk:23-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем JAR-файл
COPY build/libs/render-1.0.0.0.jar app.jar

# Открываем порт для приложения
EXPOSE 8080

# Запуск приложения
ENTRYPOINT ["java", "-jar", "app.jar"]