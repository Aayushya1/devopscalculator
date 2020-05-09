FROM openjdk
COPY target/Calculator-1.0-SNAPSHOT.jar /home
WORKDIR /home
CMD ["java" , "-jar" , "Calculator-1.0-SNAPSHOT.jar"]