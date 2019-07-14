FROM maven:3.3-jdk-8

WORKDIR /backend

COPY . /backend

RUN mvn package -q

CMD [ "java", "-jar", "target/movienet-1.0-SNAPSHOT.jar" ]

# /mnt/data/Projects/movienet-project/movienet-backend/movienet/Dockerfile
# mvn package && java -jar target/movienet-1.0-SNAPSHOT.jar