# SonarQube
1.Search sonarqube image on dockerHub(official image perfer lts one)=>Running sonarqube in a container 
docker run -d --name sonarqube-local -p 9000:9000 sonarqube:lts-community 
docker ps 

Now access this container through browser at 9000 port.

SonarQube Analysis using pipeline for generating Report
