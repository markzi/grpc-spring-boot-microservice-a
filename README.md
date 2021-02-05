# gRPC Microservice A

Intention is to be a playground for using normal Spring REST controllers and Googls gRPC protocol.

This project will most likely rely on another microservice to demonstrate communication between microservices

## Intentions

- move the proto files into a separate project and make available as a library to import
- show across microservice communications 
  - tracing
  - health checks
  - transaction handling
    - how to handle multiple microservice calls which would normal be in a transaction
      - database technique around to do this?
      - compensating transactions?
      - well-defined logging to highlight when the transaction rollback, however implements, has failed also
        - will need some way of cleaning up this data ( must be some documenation about this on the web )

## Recommendations

- [bloomrpc](https://github.com/uw-labs/bloomrpc/releases/) - gRPC Postman like UI tool. You import the ```.proto``` files and it will generate all the calls for you

## Current State

- Project Structure ( Important bits ) 
  - .proto files are in ```/src/main/proto```
  - generated code is in ```/gen/main/```
- gRPC server running on ```6565```
  - 1 gRPC endpoint ```Greet```
- Tomcat server running on ```8080```
  - 1 REST endpoint  ```/greeting/name```