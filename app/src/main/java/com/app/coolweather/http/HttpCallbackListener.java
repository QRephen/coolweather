package com.app.coolweather.http;

/**
 * @author: tuandai001
 * @Filename:
 * @Description:
 * @Copyright: Copyright (c) 2016 Tuandai Inc. All rights reserved.
 * @date: 2017/3/21
 */
public interface HttpCallbackListener {

    void onFinish(String s);

    void onError(Exception e);
}
