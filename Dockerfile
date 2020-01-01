FROM ubuntu
WORKDIR /app
COPY target/springapp.jar .
RUN apt-get update && apt-get install -y openjdk-8-jre
ENTRYPOINT java -jar springapp.jar
