# SpringDemo
A simple spring application based on Google JIB.


## Steps:

1. Pull this repository.
2. Add JIB plugin and configuration in "build.gradle". I've added already.
3. Build & push image by JIB using below cmd\
    ./gradlew jib
4. Run it in docker engine\
    docker run -p 8080:8080 proficientrvkmr/gradle-jib:0.1-SNAPSHOT


## Docker Usefull Commands:

1. 	Build Image:\
	docker build --tag=proficientrvkmr/my-image:0.1.0-SNAPSHOT .

2.	List all Docker Images\
	docker images -a 
		OR \
	docker images

3. 	List All Running Docker Containers\
	docker ps
	
4.	List All Docker Containers\
	docker ps -a
	
5.	Start a Docker Container\
	docker start <container name>
	
6.	Stop a Docker Container\
	docker stop <container name>
	
7.	Kill All Running Containers\
	docker kill $(docker ps -q)
	
8. 	Remove a Docker Image\
	docker rmi <image name>

9.	Delete All Docker Images\
	docker rmi $(docker images -q)
	
10.	Map a Host Port to a Container Port\
	-p <host port>: <container port>
	Example:\
	docker run -p 8080:8080 <image name>

11. Push Docker Image to Docker HUB\
	docker push <image name>

12. Login on Docker CLI for Docker HUB\
	docker login
