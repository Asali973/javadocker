FROM maven:3.6.0-jdk-11-slim
WORKDIR /srv
COPY src ./src
COPY pom.xml .
RUN mvn clean install -DskipTests
#RUN chmod 755 target/javadocker-0.0.1-SNAPSHOT

EXPOSE 9999
CMD ["java","-jar","./target/javadocker-0.0.1-SNAPSHOT.jar"]

#CMD ["ls", "-la","target"]
