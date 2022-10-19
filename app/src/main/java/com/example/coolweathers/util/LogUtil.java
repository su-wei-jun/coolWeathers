package com.example.coolweathers.util;

import android.util.Log;

public class LogUtil {
    private static String versionName = "1.0.0";
    private static final String TAG = "GwmVrAdapter_"+ versionName + "_";
    public static final int verbose=1;
    public static final int debug=2;
    public static final int info=3;
    public static final int warn=4;
    public static final int error=5;
    public static final int nothing=6;
    public static int level=verbose;
    //当项目发布的时候不需要打印日志，打印日志是十分浪费时间的，所以最后需要关闭这个打印的功能，level这个变量的取值可以是任意的值，当这个的值大于打印参数值的时候，就不满足条件，不打印日志
    public static void v(String tag,String msg){
        if(level<=verbose){
            Log.v(tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if(level<=debug){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(level<=info){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag,String msg){
        if(level<=warn){
            Log.w(tag,msg);
        }
    }
    public static void e(String tag,String msg){
        if(level<=error){
            Log.e(tag,msg);
        }
    }
}
