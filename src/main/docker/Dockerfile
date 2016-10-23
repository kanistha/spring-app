FROM ingensi/oracle-jdk
VOLUME /tmp
ADD spring-app-1.0-SNAPSHOT.jar spring-app.jar
RUN sh -c 'touch /spring-app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-app.jar"]