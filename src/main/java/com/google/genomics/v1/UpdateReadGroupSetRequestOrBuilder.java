// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface UpdateReadGroupSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.UpdateReadGroupSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string read_group_set_id = 1;</code>
   *
   * <pre>
   * The ID of the read group set to be updated. The caller must have WRITE
   * permissions to the dataset associated with this read group set.
   * </pre>
   */
  java.lang.String getReadGroupSetId();
  /**
   * <code>optional string read_group_set_id = 1;</code>
   *
   * <pre>
   * The ID of the read group set to be updated. The caller must have WRITE
   * permissions to the dataset associated with this read group set.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReadGroupSetIdBytes();

  /**
   * <code>optional .google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   *
   * <pre>
   * The new read group set data. Currently, only the `name`
   * field is mutable.
   * </pre>
   */
  boolean hasReadGroupSet();
  /**
   * <code>optional .google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   *
   * <pre>
   * The new read group set data. Currently, only the `name`
   * field is mutable.
   * </pre>
   */
  com.google.genomics.v1.ReadGroupSet getReadGroupSet();
  /**
   * <code>optional .google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   *
   * <pre>
   * The new read group set data. Currently, only the `name`
   * field is mutable.
   * </pre>
   */
  com.google.genomics.v1.ReadGroupSetOrBuilder getReadGroupSetOrBuilder();

  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  boolean hasUpdateMask();
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}