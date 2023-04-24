# RabbitMQ-Begin


Before doing the project ,First make sure that you have installed the RabbitMQ in the local machine

To install the RabbitMQ via Docker,

docker pull rabbitmq:3.10.5-management

To run the container => docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10.5-management


Refer to the pom.xml for the dependencies 

After doing the project, hit http://localhost:8080/api/v1/publish?message=sujith in browser and check the console and http://locahost:15672 for the getmessage

we can also use the postman for the passing the post mapping with json content http://localhost:8080/api/v1/publish

with the raw body of json format

{
    "id":1,
    "firstName":"Sujith",
    "lastName":"selva"
}


Make sure that your RabbitMQ contaier is running during the running of the springboot application.
