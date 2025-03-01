# gRPC with Protocol Buffers Example

This project demonstrates the use of **gRPC** and **Protocol Buffers (Protobuf)** for efficient communication between services.

## **What is gRPC?**
gRPC is a high-performance framework for building distributed systems, using Protobuf to serialize data for low-latency, high-throughput communication.

## **What is Protocol Buffers (Protobuf)?**
Protobuf is a language-agnostic format for serializing structured data. It is compact, fast, and ensures forward and backward compatibility.

## **Key Features**
- **Compact and Efficient**: Faster and more compact than JSON/XML.
- **Cross-Language Compatibility**: Supported in languages like Java, Python, Go, etc.
- **Schema-Based**: Ensures structured data and type safety.
- **Backward Compatibility**: Easy to evolve without breaking existing services.

## **Steps to Use**
1. **Define the Data Structure**: Create a `.proto` file to define request/response data and the gRPC service.
2. **Generate Code**: Use the Protobuf compiler (`protoc`) to generate code in your preferred language.
3. **Create Server**: Implement the server with gRPC to handle incoming requests.
4. **Use gRPC Client**: Communicate with the server by sending serialized data and receiving responses.

## **Advantages**
- **Speed**: Faster serialization/deserialization than JSON/XML.
- **Size**: Compact binary format reduces data size.
- **Cross-Language**: Supports various programming languages.
- **Strong Typing**: Ensures data integrity through schema.

## **When to Use Protobuf**
- **Microservices**: For efficient service-to-service communication.
- **Performance-Critical Applications**: In systems needing low-latency, high-throughput.
- **Complex Data**: When serializing structured, complex data efficiently.

## **make test call using grpcurl from powershell:**

C:\Users\<user>\Downloads\grpcurl_1.9.2_windows_x86_64> .\grpcurl.exe -plaintext -d '{\"message\": \"John\"}' localhost:9090 com.cp.grpc.GreetingService/greeting
{
  "message": "Received your message. John Hello from server."
}

Below plugin generate the stubs and pojo classes based on the proto buffer file.
   <artifactId>protobuf-maven-plugin</artifactId>
