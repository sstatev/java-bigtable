/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the table. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the table. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2;
   * </code>
   */
  int getClusterStatesCount();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2;
   * </code>
   */
  boolean containsClusterStates(java.lang.String key);
  /** Use {@link #getClusterStatesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.Table.ClusterState>
      getClusterStates();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.Table.ClusterState>
      getClusterStatesMap();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2;
   * </code>
   */
  com.google.bigtable.admin.v2.Table.ClusterState getClusterStatesOrDefault(
      java.lang.String key, com.google.bigtable.admin.v2.Table.ClusterState defaultValue);
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2;
   * </code>
   */
  com.google.bigtable.admin.v2.Table.ClusterState getClusterStatesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  int getColumnFamiliesCount();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  boolean containsColumnFamilies(java.lang.String key);
  /** Use {@link #getColumnFamiliesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.ColumnFamily> getColumnFamilies();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.ColumnFamily> getColumnFamiliesMap();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  com.google.bigtable.admin.v2.ColumnFamily getColumnFamiliesOrDefault(
      java.lang.String key, com.google.bigtable.admin.v2.ColumnFamily defaultValue);
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  com.google.bigtable.admin.v2.ColumnFamily getColumnFamiliesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The granularity (i.e. `MILLIS`) at which timestamps are stored in
   * this table. Timestamps not matching the granularity will be rejected.
   * If unspecified at creation time, the value will be set to `MILLIS`.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.TimestampGranularity granularity = 4;</code>
   *
   * @return The enum numeric value on the wire for granularity.
   */
  int getGranularityValue();
  /**
   *
   *
   * <pre>
   * (`CreationOnly`)
   * The granularity (i.e. `MILLIS`) at which timestamps are stored in
   * this table. Timestamps not matching the granularity will be rejected.
   * If unspecified at creation time, the value will be set to `MILLIS`.
   * Views: `SCHEMA_VIEW`, `FULL`
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.TimestampGranularity granularity = 4;</code>
   *
   * @return The granularity.
   */
  com.google.bigtable.admin.v2.Table.TimestampGranularity getGranularity();
}
