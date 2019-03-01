/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.york.faceapi.callback;

import com.york.faceapi.entity.LivenessModel;

public interface ILivenessCallBack {
    public void onCallback(LivenessModel livenessModel);

    public void onTip(int code, String msg);

    public void onCanvasRectCallback(LivenessModel livenessModel);
}
