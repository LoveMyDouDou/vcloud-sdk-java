// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod_play.proto

package com.bytedanceapi.model.common;

public final class VodPlay {
  private VodPlay() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetPlayInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetPlayInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetPlayInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetPlayInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetPlayInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetPlayInfoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodAdaptiveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodAdaptiveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodPlayInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodPlayInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetOriginalPlayInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetOriginalPlayInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ttvcloud_models_VodGetOriginalPlayInfoResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016vod_play.proto\022\017ttvcloud.models\032\nbase." +
      "proto\032\034google/api/annotations.proto\"\230\001\n\025" +
      "VodGetPlayInfoRequest\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Fo" +
      "rmat\030\002 \001(\t\022\r\n\005Codec\030\003 \001(\t\022\022\n\nDefinition\030" +
      "\004 \001(\t\022\020\n\010FileType\030\005 \001(\t\022\020\n\010LogoType\030\006 \001(" +
      "\t\022\016\n\006Base64\030\007 \001(\t\022\013\n\003Ssl\030\010 \001(\t\"\217\001\n\026VodGe" +
      "tPlayInfoResponse\022>\n\020ResponseMetadata\030\001 " +
      "\001(\0132$.Vcloud.Models.Base.ResponseMetadat" +
      "a\0225\n\006Result\030\002 \001(\0132%.ttvcloud.models.VodG" +
      "etPlayInfoResult\"\202\002\n\024VodGetPlayInfoResul" +
      "t\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Status\030\002 \001(\003\022\021\n\tPoster" +
      "Url\030\003 \001(\t\022\020\n\010Duration\030\004 \001(\002\022\020\n\010FileType\030" +
      "\005 \001(\t\022\026\n\016EnableAdaptive\030\006 \001(\010\022\022\n\nTotalCo" +
      "unt\030\007 \001(\003\0226\n\014AdaptiveInfo\030\010 \001(\0132 .ttvclo" +
      "ud.models.VodAdaptiveInfo\0222\n\014PlayInfoLis" +
      "t\030\t \003(\0132\034.ttvcloud.models.VodPlayInfo\"S\n" +
      "\017VodAdaptiveInfo\022\023\n\013MainPlayUrl\030\001 \001(\t\022\025\n" +
      "\rBackupPlayUrl\030\002 \001(\t\022\024\n\014AdaptiveType\030\003 \001" +
      "(\t\"\320\003\n\013VodPlayInfo\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md" +
      "5\030\002 \001(\t\022\020\n\010FileType\030\003 \001(\t\022\016\n\006Format\030\004 \001(" +
      "\t\022\r\n\005Codec\030\005 \001(\t\022\022\n\nDefinition\030\006 \001(\t\022\023\n\013" +
      "MainPlayUrl\030\007 \001(\t\022\025\n\rBackupPlayUrl\030\010 \001(\t" +
      "\022\017\n\007Bitrate\030\t \001(\002\022\r\n\005Width\030\n \001(\003\022\016\n\006Heig" +
      "ht\030\013 \001(\003\022\014\n\004Size\030\014 \001(\003\022\021\n\tCheckInfo\030\r \001(" +
      "\t\022\022\n\nIndexRange\030\016 \001(\t\022\021\n\tInitRange\030\017 \001(\t" +
      "\022\023\n\013PreloadSize\030\020 \001(\003\022\026\n\016PreloadMinStep\030" +
      "\021 \001(\003\022\026\n\016PreloadMaxStep\030\022 \001(\003\022\027\n\017Preload" +
      "Interval\030\023 \001(\003\022\024\n\014P2pVerifyUrl\030\024 \001(\t\022\020\n\010" +
      "PlayAuth\030\025 \001(\t\022\022\n\nPlayAuthId\030\026 \001(\t\022\020\n\010Lo" +
      "goType\030\027 \001(\t\022\017\n\007Quality\030\030 \001(\t\"I\n\035VodGetO" +
      "riginalPlayInfoRequest\022\013\n\003Vid\030\001 \001(\t\022\016\n\006B" +
      "ase64\030\002 \001(\t\022\013\n\003Ssl\030\003 \001(\t\"\237\001\n\036VodGetOrigi" +
      "nalPlayInfoResponse\022>\n\020ResponseMetadata\030" +
      "\001 \001(\0132$.Vcloud.Models.Base.ResponseMetad" +
      "ata\022=\n\006Result\030\002 \001(\0132-.ttvcloud.models.Vo" +
      "dGetOriginalPlayInfoResult\"\330\001\n\034VodGetOri" +
      "ginalPlayInfoResult\022\020\n\010FileType\030\001 \001(\t\022\020\n" +
      "\010Duration\030\002 \001(\002\022\014\n\004Size\030\003 \001(\003\022\016\n\006Height\030" +
      "\004 \001(\003\022\r\n\005Width\030\005 \001(\003\022\016\n\006Format\030\006 \001(\t\022\r\n\005" +
      "Codec\030\007 \001(\t\022\017\n\007Bitrate\030\010 \001(\002\022\013\n\003Md5\030\t \001(" +
      "\t\022\023\n\013MainPlayUrl\030\n \001(\t\022\025\n\rBackupPlayUrl\030" +
      "\013 \001(\t2\226\004\n\016VodPlayService\022\352\001\n\013GetPlayInfo" +
      "\022&.ttvcloud.models.VodGetPlayInfoRequest" +
      "\032\'.ttvcloud.models.VodGetPlayInfoRespons" +
      "e\"\211\001\202\323\344\223\002\202\001\022\'/?Action=GetPlayInfo&Versio" +
      "n=2020-08-01:\025VodGetPlayInfoRequestZ@\"\'/" +
      "?Action=GetPlayInfo&Version=2020-08-01:\025" +
      "VodGetPlayInfoRequest\022\226\002\n\023GetOriginalPla" +
      "yInfo\022..ttvcloud.models.VodGetOriginalPl" +
      "ayInfoRequest\032/.ttvcloud.models.VodGetOr" +
      "iginalPlayInfoResponse\"\235\001\202\323\344\223\002\226\001\022)/video" +
      "/atlas/top/vod/v2/GetOriginPlayInfo:\035Vod" +
      "GetOriginalPlayInfoRequestZJ\")/video/atl" +
      "as/top/vod/v2/GetOriginPlayInfo:\035VodGetO" +
      "riginalPlayInfoRequestBp\n\035com.bytedancea" +
      "pi.model.commonB\007VodPlayP\001Z\010.;models\240\001\001\330" +
      "\001\001\370\001\001\302\002\000\312\002\021Vcloud\\Models\\Vod\342\002\031Vcloud\\Mo" +
      "dels\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.bytedanceapi.model.common.Base.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_ttvcloud_models_VodGetPlayInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ttvcloud_models_VodGetPlayInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetPlayInfoRequest_descriptor,
        new java.lang.String[] { "Vid", "Format", "Codec", "Definition", "FileType", "LogoType", "Base64", "Ssl", });
    internal_static_ttvcloud_models_VodGetPlayInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ttvcloud_models_VodGetPlayInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetPlayInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_ttvcloud_models_VodGetPlayInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ttvcloud_models_VodGetPlayInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetPlayInfoResult_descriptor,
        new java.lang.String[] { "Vid", "Status", "PosterUrl", "Duration", "FileType", "EnableAdaptive", "TotalCount", "AdaptiveInfo", "PlayInfoList", });
    internal_static_ttvcloud_models_VodAdaptiveInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ttvcloud_models_VodAdaptiveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodAdaptiveInfo_descriptor,
        new java.lang.String[] { "MainPlayUrl", "BackupPlayUrl", "AdaptiveType", });
    internal_static_ttvcloud_models_VodPlayInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ttvcloud_models_VodPlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodPlayInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Format", "Codec", "Definition", "MainPlayUrl", "BackupPlayUrl", "Bitrate", "Width", "Height", "Size", "CheckInfo", "IndexRange", "InitRange", "PreloadSize", "PreloadMinStep", "PreloadMaxStep", "PreloadInterval", "P2PVerifyUrl", "PlayAuth", "PlayAuthId", "LogoType", "Quality", });
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetOriginalPlayInfoRequest_descriptor,
        new java.lang.String[] { "Vid", "Base64", "Ssl", });
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetOriginalPlayInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ttvcloud_models_VodGetOriginalPlayInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ttvcloud_models_VodGetOriginalPlayInfoResult_descriptor,
        new java.lang.String[] { "FileType", "Duration", "Size", "Height", "Width", "Format", "Codec", "Bitrate", "Md5", "MainPlayUrl", "BackupPlayUrl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.bytedanceapi.model.common.Base.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
