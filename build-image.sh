#!/bin/bash
sleep 2

echo "Gerando JAR"

mvn clean package && cp target/springapp.jar .

echo "Gerando imagem"
docker build -t caelum/springapp:1.0 .
