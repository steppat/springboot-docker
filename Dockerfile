FROM ubuntu:18.04
WORKDIR /app
ARG JAR_FILE_NAME=springapp.jar
COPY target/$JAR_FILE_NAME .
RUN apt-get update && apt-get install -y openjdk-8-jre
ENV JAR_NAME=$JAR_FILE_NAME
ENTRYPOINT java -jar $JAR_NAME
