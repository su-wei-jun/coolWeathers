package com.example.coolweathers.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    public static void  sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        //之后调用OkHttpClient的newCall方法来创建一个Call对象，并
        // 调用它的execute方法来发送请求并获取服务器返回的数据
        okHttpClient.newCall(request).enqueue(callback);
    }
}
