FROM openjdk:17-jdk-alpine
LABEL maintainer="Nidhi"
ADD target/demo-docker-dockerhub-k8s.jar dockerHub.jar
ENTRYPOINT ["java","-jar","/dockerHub.jar"]