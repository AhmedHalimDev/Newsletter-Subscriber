FROM java:8-jre

ADD NewsletterSubsriber-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-jar", "/app/NewsletterSubsriber-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
