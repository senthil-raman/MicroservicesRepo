FROM java:openjdk-8u45-jdk

MAINTAINER senthil@me.com


ADD . /app

RUN mvn clean package -Pdeploy

ENV JAVA_ENV=PRODUCTION

EXPOSE 8080

CMD ["java", "-server", "-cp", "target/classes:bookings/target/dependency/*", "com.kumuluz.ee.EeApplication"]