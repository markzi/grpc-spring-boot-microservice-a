// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.example.cloudrun.grpc;

public final class Greeting {
  private Greeting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_cloudrun_grpc_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_cloudrun_grpc_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_cloudrun_grpc_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_cloudrun_grpc_GreetingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\031com.example.cloudrun.g" +
      "rpc\"\037\n\017GreetingRequest\022\014\n\004name\030\001 \001(\t\"!\n\020" +
      "GreetingResponse\022\r\n\005reply\030\001 \001(\t2u\n\017Greet" +
      "ingService\022b\n\005Greet\022*.com.example.cloudr" +
      "un.grpc.GreetingRequest\032+.com.example.cl" +
      "oudrun.grpc.GreetingResponse\"\000B\035\n\031com.ex" +
      "ample.cloudrun.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_cloudrun_grpc_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_cloudrun_grpc_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_cloudrun_grpc_GreetingRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_cloudrun_grpc_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_cloudrun_grpc_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_cloudrun_grpc_GreetingResponse_descriptor,
        new java.lang.String[] { "Reply", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
