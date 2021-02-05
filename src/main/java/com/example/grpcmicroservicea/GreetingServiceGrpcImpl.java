package com.example.grpcmicroservicea;

import com.example.cloudrun.grpc.GreetingRequest;
import com.example.cloudrun.grpc.GreetingResponse;
import com.example.cloudrun.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class GreetingServiceGrpcImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    private final GreetingSupplierService greetingSupplierService;

    public GreetingServiceGrpcImpl(GreetingSupplierService greetingSupplierService) {
        this.greetingSupplierService = greetingSupplierService;
    }

    @Override
    public void greet(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {

        String reply = greetingSupplierService.greeting.apply(request.getName());

        GreetingResponse response = GreetingResponse.newBuilder()
                .setReply(reply)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
