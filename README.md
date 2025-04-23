# springboot-vuejs-crud
Spring Boot Rest CRUD API example - Spring Data JPA to interact with MySQL database.

### Things todo list:
1. Clone this repository: `git clone https://github.com/hoangthong1909/k8s-spring-vue.git`
2. Go inside backend folder: `cd backend`
3. Build Spring Boot App: `mvn -DskipTests=true  package`
4. Build docker :
5. docker build -t <tên_image>:<tag> <đường_dẫn_đến_dockerfile>
=> VD : docker build -t username/thonght-spring-backend:1.2 . (FE + BE)
        docker push <tên_image>:<tag> (FE + BE)
=> VD : docker push username/thonght-spring-backend:1.2
6. Apply các file yaml k8s (FE + BE + Mysql)
=> VD :  kubectl apply -f .\deploy\deployment.yaml   
7. Check deploy:
=> kubectl -n test get svc -o wide
NAME           TYPE       CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE   SELECTOR
backend-svc    NodePort   10.232.210.81    <none>        8080:31302/TCP   21h   app=backend
frontend-svc   NodePort   10.232.101.255   <none>        80:32333/TCP     21h   app=frontend
mysql-svc      NodePort   10.202.49.173    <none>        3306:30306/TCP   21h   app=mysql

=> localhost:32333
