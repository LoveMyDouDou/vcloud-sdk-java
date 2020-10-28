// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod_play.proto

package com.bytedanceapi.model.common;

public interface VodGetOriginalPlayInfoResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ttvcloud.models.VodGetOriginalPlayInfoResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *返回的媒体类型(video/audio)
   * </pre>
   *
   * <code>string FileType = 1;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   *返回的媒体类型(video/audio)
   * </pre>
   *
   * <code>string FileType = 1;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   *视频时长(单位：s)
   * </pre>
   *
   * <code>float Duration = 2;</code>
   * @return The duration.
   */
  float getDuration();

  /**
   * <pre>
   *视频文件大小
   * </pre>
   *
   * <code>int64 Size = 3;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   *视频高度
   * </pre>
   *
   * <code>int64 Height = 4;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <pre>
   *视频宽度
   * </pre>
   *
   * <code>int64 Width = 5;</code>
   * @return The width.
   */
  long getWidth();

  /**
   * <pre>
   *视频格式
   * </pre>
   *
   * <code>string Format = 6;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   *视频格式
   * </pre>
   *
   * <code>string Format = 6;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   *编码类型
   * </pre>
   *
   * <code>string Codec = 7;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   *编码类型
   * </pre>
   *
   * <code>string Codec = 7;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   *码率(Kbps)
   * </pre>
   *
   * <code>float Bitrate = 8;</code>
   * @return The bitrate.
   */
  float getBitrate();

  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 9;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 9;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();

  /**
   * <pre>
   *主播放地址
   * </pre>
   *
   * <code>string MainPlayUrl = 10;</code>
   * @return The mainPlayUrl.
   */
  java.lang.String getMainPlayUrl();
  /**
   * <pre>
   *主播放地址
   * </pre>
   *
   * <code>string MainPlayUrl = 10;</code>
   * @return The bytes for mainPlayUrl.
   */
  com.google.protobuf.ByteString
      getMainPlayUrlBytes();

  /**
   * <pre>
   *备用播放地址
   * </pre>
   *
   * <code>string BackupPlayUrl = 11;</code>
   * @return The backupPlayUrl.
   */
  java.lang.String getBackupPlayUrl();
  /**
   * <pre>
   *备用播放地址
   * </pre>
   *
   * <code>string BackupPlayUrl = 11;</code>
   * @return The bytes for backupPlayUrl.
   */
  com.google.protobuf.ByteString
      getBackupPlayUrlBytes();
}
