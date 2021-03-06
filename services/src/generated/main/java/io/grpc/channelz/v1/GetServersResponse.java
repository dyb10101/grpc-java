// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * Protobuf type {@code grpc.channelz.v1.GetServersResponse}
 */
public  final class GetServersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.GetServersResponse)
    GetServersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetServersResponse.newBuilder() to construct.
  private GetServersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetServersResponse() {
    server_ = java.util.Collections.emptyList();
    end_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetServersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              server_ = new java.util.ArrayList<io.grpc.channelz.v1.Server>();
              mutable_bitField0_ |= 0x00000001;
            }
            server_.add(
                input.readMessage(io.grpc.channelz.v1.Server.parser(), extensionRegistry));
            break;
          }
          case 16: {

            end_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        server_ = java.util.Collections.unmodifiableList(server_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServersResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.channelz.v1.GetServersResponse.class, io.grpc.channelz.v1.GetServersResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SERVER_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.channelz.v1.Server> server_;
  /**
   * <pre>
   * list of servers that the connection detail service knows about.  Sorted in
   * ascending server_id order.
   * Must contain at least 1 result, otherwise 'end' must be true.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
   */
  public java.util.List<io.grpc.channelz.v1.Server> getServerList() {
    return server_;
  }
  /**
   * <pre>
   * list of servers that the connection detail service knows about.  Sorted in
   * ascending server_id order.
   * Must contain at least 1 result, otherwise 'end' must be true.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
   */
  public java.util.List<? extends io.grpc.channelz.v1.ServerOrBuilder> 
      getServerOrBuilderList() {
    return server_;
  }
  /**
   * <pre>
   * list of servers that the connection detail service knows about.  Sorted in
   * ascending server_id order.
   * Must contain at least 1 result, otherwise 'end' must be true.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
   */
  public int getServerCount() {
    return server_.size();
  }
  /**
   * <pre>
   * list of servers that the connection detail service knows about.  Sorted in
   * ascending server_id order.
   * Must contain at least 1 result, otherwise 'end' must be true.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
   */
  public io.grpc.channelz.v1.Server getServer(int index) {
    return server_.get(index);
  }
  /**
   * <pre>
   * list of servers that the connection detail service knows about.  Sorted in
   * ascending server_id order.
   * Must contain at least 1 result, otherwise 'end' must be true.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
   */
  public io.grpc.channelz.v1.ServerOrBuilder getServerOrBuilder(
      int index) {
    return server_.get(index);
  }

  public static final int END_FIELD_NUMBER = 2;
  private boolean end_;
  /**
   * <pre>
   * If set, indicates that the list of servers is the final list.  Requesting
   * more servers will only return more if they are created after this RPC
   * completes.
   * </pre>
   *
   * <code>bool end = 2;</code>
   */
  public boolean getEnd() {
    return end_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < server_.size(); i++) {
      output.writeMessage(1, server_.get(i));
    }
    if (end_ != false) {
      output.writeBool(2, end_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < server_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, server_.get(i));
    }
    if (end_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, end_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.channelz.v1.GetServersResponse)) {
      return super.equals(obj);
    }
    io.grpc.channelz.v1.GetServersResponse other = (io.grpc.channelz.v1.GetServersResponse) obj;

    boolean result = true;
    result = result && getServerList()
        .equals(other.getServerList());
    result = result && (getEnd()
        == other.getEnd());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getServerCount() > 0) {
      hash = (37 * hash) + SERVER_FIELD_NUMBER;
      hash = (53 * hash) + getServerList().hashCode();
    }
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.channelz.v1.GetServersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.channelz.v1.GetServersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.GetServersResponse)
      io.grpc.channelz.v1.GetServersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServersResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.channelz.v1.GetServersResponse.class, io.grpc.channelz.v1.GetServersResponse.Builder.class);
    }

    // Construct using io.grpc.channelz.v1.GetServersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServerFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (serverBuilder_ == null) {
        server_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        serverBuilder_.clear();
      }
      end_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServersResponse_descriptor;
    }

    public io.grpc.channelz.v1.GetServersResponse getDefaultInstanceForType() {
      return io.grpc.channelz.v1.GetServersResponse.getDefaultInstance();
    }

    public io.grpc.channelz.v1.GetServersResponse build() {
      io.grpc.channelz.v1.GetServersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.channelz.v1.GetServersResponse buildPartial() {
      io.grpc.channelz.v1.GetServersResponse result = new io.grpc.channelz.v1.GetServersResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (serverBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          server_ = java.util.Collections.unmodifiableList(server_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.server_ = server_;
      } else {
        result.server_ = serverBuilder_.build();
      }
      result.end_ = end_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.channelz.v1.GetServersResponse) {
        return mergeFrom((io.grpc.channelz.v1.GetServersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.channelz.v1.GetServersResponse other) {
      if (other == io.grpc.channelz.v1.GetServersResponse.getDefaultInstance()) return this;
      if (serverBuilder_ == null) {
        if (!other.server_.isEmpty()) {
          if (server_.isEmpty()) {
            server_ = other.server_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServerIsMutable();
            server_.addAll(other.server_);
          }
          onChanged();
        }
      } else {
        if (!other.server_.isEmpty()) {
          if (serverBuilder_.isEmpty()) {
            serverBuilder_.dispose();
            serverBuilder_ = null;
            server_ = other.server_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serverBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServerFieldBuilder() : null;
          } else {
            serverBuilder_.addAllMessages(other.server_);
          }
        }
      }
      if (other.getEnd() != false) {
        setEnd(other.getEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.channelz.v1.GetServersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.channelz.v1.GetServersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.channelz.v1.Server> server_ =
      java.util.Collections.emptyList();
    private void ensureServerIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        server_ = new java.util.ArrayList<io.grpc.channelz.v1.Server>(server_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.channelz.v1.Server, io.grpc.channelz.v1.Server.Builder, io.grpc.channelz.v1.ServerOrBuilder> serverBuilder_;

    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public java.util.List<io.grpc.channelz.v1.Server> getServerList() {
      if (serverBuilder_ == null) {
        return java.util.Collections.unmodifiableList(server_);
      } else {
        return serverBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public int getServerCount() {
      if (serverBuilder_ == null) {
        return server_.size();
      } else {
        return serverBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public io.grpc.channelz.v1.Server getServer(int index) {
      if (serverBuilder_ == null) {
        return server_.get(index);
      } else {
        return serverBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder setServer(
        int index, io.grpc.channelz.v1.Server value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.set(index, value);
        onChanged();
      } else {
        serverBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder setServer(
        int index, io.grpc.channelz.v1.Server.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.set(index, builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder addServer(io.grpc.channelz.v1.Server value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.add(value);
        onChanged();
      } else {
        serverBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder addServer(
        int index, io.grpc.channelz.v1.Server value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerIsMutable();
        server_.add(index, value);
        onChanged();
      } else {
        serverBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder addServer(
        io.grpc.channelz.v1.Server.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.add(builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder addServer(
        int index, io.grpc.channelz.v1.Server.Builder builderForValue) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.add(index, builderForValue.build());
        onChanged();
      } else {
        serverBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder addAllServer(
        java.lang.Iterable<? extends io.grpc.channelz.v1.Server> values) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, server_);
        onChanged();
      } else {
        serverBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder clearServer() {
      if (serverBuilder_ == null) {
        server_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serverBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder removeServer(int index) {
      if (serverBuilder_ == null) {
        ensureServerIsMutable();
        server_.remove(index);
        onChanged();
      } else {
        serverBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public io.grpc.channelz.v1.Server.Builder getServerBuilder(
        int index) {
      return getServerFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public io.grpc.channelz.v1.ServerOrBuilder getServerOrBuilder(
        int index) {
      if (serverBuilder_ == null) {
        return server_.get(index);  } else {
        return serverBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public java.util.List<? extends io.grpc.channelz.v1.ServerOrBuilder> 
         getServerOrBuilderList() {
      if (serverBuilder_ != null) {
        return serverBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(server_);
      }
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public io.grpc.channelz.v1.Server.Builder addServerBuilder() {
      return getServerFieldBuilder().addBuilder(
          io.grpc.channelz.v1.Server.getDefaultInstance());
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public io.grpc.channelz.v1.Server.Builder addServerBuilder(
        int index) {
      return getServerFieldBuilder().addBuilder(
          index, io.grpc.channelz.v1.Server.getDefaultInstance());
    }
    /**
     * <pre>
     * list of servers that the connection detail service knows about.  Sorted in
     * ascending server_id order.
     * Must contain at least 1 result, otherwise 'end' must be true.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.Server server = 1;</code>
     */
    public java.util.List<io.grpc.channelz.v1.Server.Builder> 
         getServerBuilderList() {
      return getServerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.channelz.v1.Server, io.grpc.channelz.v1.Server.Builder, io.grpc.channelz.v1.ServerOrBuilder> 
        getServerFieldBuilder() {
      if (serverBuilder_ == null) {
        serverBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.channelz.v1.Server, io.grpc.channelz.v1.Server.Builder, io.grpc.channelz.v1.ServerOrBuilder>(
                server_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        server_ = null;
      }
      return serverBuilder_;
    }

    private boolean end_ ;
    /**
     * <pre>
     * If set, indicates that the list of servers is the final list.  Requesting
     * more servers will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public boolean getEnd() {
      return end_;
    }
    /**
     * <pre>
     * If set, indicates that the list of servers is the final list.  Requesting
     * more servers will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public Builder setEnd(boolean value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, indicates that the list of servers is the final list.  Requesting
     * more servers will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public Builder clearEnd() {
      
      end_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.GetServersResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.GetServersResponse)
  private static final io.grpc.channelz.v1.GetServersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.channelz.v1.GetServersResponse();
  }

  public static io.grpc.channelz.v1.GetServersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetServersResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetServersResponse>() {
    public GetServersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetServersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetServersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetServersResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.channelz.v1.GetServersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

