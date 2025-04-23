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

![image](https://github.com/user-attachments/assets/360a49b9-7dab-486e-b211-26f9e769c720)

=> localhost:32333
