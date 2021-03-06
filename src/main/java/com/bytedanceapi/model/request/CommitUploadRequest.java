package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedanceapi.model.beans.Functions;
import lombok.Data;

import java.util.List;

@Data
public class CommitUploadRequest {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "CallbackArgs")
    String callbackArgs;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "Functions")
    List<Functions> functions;
}
