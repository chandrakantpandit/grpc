package com.cp.grpc.service;

import com.cp.grpc.GreetingRequest;
import com.cp.grpc.GreetingResponse;
import com.cp.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        GreetingResponse greetingResponse = GreetingResponse.newBuilder().setMessage("Received your message. " + message
                + " Hello from server.").build();
        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
