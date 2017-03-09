FROM java:openjdk-8u45-jdk
ADD address-1.0.0-SNAPSHOT.jar
EXPOSE 8080

CMD ["java", "-server", "-cp", "target/classes:target/dependency/*", "com.kumuluz.ee.EeApplication"]