ARG REGISTRY
# FROM maven:3.8.8-eclipse-temurin-11
FROM ${REGISTRY}maven:3.8.8-eclipse-temurin-11
ARG http_proxy
ARG https_proxy
ARG no_proxy

WORKDIR /app
COPY settings.xml /app/settings.xml
COPY pom.xml /app/pom.xml
COPY webapp /app/webapp
COPY server /app/server
RUN mvn clean install
