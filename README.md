# carty
A cart service API made using spring boot.

## Technologies Used:
- [SpringBoot](https://spring.io/projects/spring-boot/)
    - [lombok](https://projectlombok.org/features/all)
    - [SpringBoot Web](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html)
    - [SpringBoot DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)
    - [Spring Configuration Processor](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-configuration-processor)
- [Java-17](https://www.oracle.com/news/announcement/oracle-releases-java-17-2021-09-14/)

## Getting Started

- Clone the Repository and cd into it.

        
        git clone git@github.com:2k4sm/carty.git
        cd carty

- To Run the Server


        ./mvnw clean spring-boot:run

- For Developing

    - Compile Using.

        
            ./mvnw clean package
    
    - Run the Server Using


            java -jar target/carty-0.0.1-SNAPSHOT.jar



## API Endpoints

### GET all carts.
- GET [/carts](http://localhost:8080/carts)

  ![image](https://github.com/2k4sm/carty/assets/101013814/b984ff44-404b-49d1-aa28-7da3ae39e525)

### GET cart by id.
- GET [/carts/5](http://localhost:8080/carts/5)

    ![image](https://github.com/2k4sm/carty/assets/101013814/5f169182-9616-430e-9287-4963e1284f93)

### GET all carts filtered by date.

- GET [/carts/filter?startdate=2019-10-24&enddate=2023-12-24](http://localhost:8080/carts/filter?startdate=2020-03-01&enddate=2020-03-01)

    ![image](https://github.com/2k4sm/carty/assets/101013814/b4fad5b4-71f6-46ac-b929-5bff6dcf682d)


### GET all carts of a user by userId.

- GET [/carts/user/1](http://localhost:8080/carts/user/1)

    ![image](https://github.com/2k4sm/carty/assets/101013814/3ec8a812-5eb3-46c4-bf57-06253f75b418)

### POST create a new cart.

- POST [/carts](http://localhost:8080/carts)

    - Payload:

              {
                "userId":3,
                "date":"2024-02-12",
                "products":[{"productId":12,"quantity":110},{"productId":1,"quantity":500}]
              }

      ![image](https://github.com/2k4sm/carty/assets/101013814/60899a48-4dc3-4fba-8a7c-6300e1198011)

### PUT update cart by id.

- PUT [/carts/10](http://localhost:8080/carts/10)


  - Payload:

              {
                  "userId":13,
                  "date":"2024-03-18",
                  "products":[{"productId":12,"quantity":110},{"productId":13,"quantity":600},{"productId":14,"quantity":180},{"productId":2,"quantity":170}]
              }


    ![image](https://github.com/2k4sm/carty/assets/101013814/3324d1fe-a2cf-4050-834f-6a4a8cb6e3b4)


### DELETE cart by id.

- DELETE [/carts/7](http://localhost:8080/carts/7)


  ![image](https://github.com/2k4sm/carty/assets/101013814/649e0c4d-de3c-490a-a422-c2d7c4a0241b)


## Thanks for Using carty API.

# License


    MIT License

    Copyright (c) 2024 Shrinibas Mahanta

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
