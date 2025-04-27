# DTO pattern: transfer data from a service layer to a presentation layer
## model->repository->service(with serviceImpl)->dto->controller
User->UserRepository(UserRepositoryImpl)->UserService(with UserServiceImpl-> <br>
UserDTO(or related combination here its combo with location**UserLocationDTO**)->controller

![image](https://github.com/user-attachments/assets/f976f681-c40e-4a3a-9038-12156d43fdff)

REFERENCE FOR SPRINGBOOT Hibernate and other patterns: <br>
https://github.com/RameshMF/Hibernate-ORM-Tutorials

REFERENCE FOR SPRINGBOOT fullstack: <br>
https://github.com/RameshMF/spring-boot-react-fullstack-examples
