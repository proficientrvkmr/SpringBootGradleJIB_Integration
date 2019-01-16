# SpringDemo
A simple spring application based on Google JIB.


## Steps:

1. Pull this repository.
2. Add JIB plugin and configuration in "build.gradle". I've added already.
3. Build & push image by JIB using below cmd\
    ./gradlew jib
4. Run it in docker engine\
    docker run -p 8080:8080 proficientrvkmr/gradle-jib:0.1-SNAPSHOT
