package com.example.coolweathers.util;

import android.text.TextUtils;

import com.example.coolweathers.db.City;
import com.example.coolweathers.db.County;
import com.example.coolweathers.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    private static final String TAG = Utility.class.getSimpleName();
    /*
    解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray=new JSONArray(response);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject provinceobject=jsonArray.getJSONObject(i);
                    LogUtil.v(TAG,"provinceobject"+provinceobject);
                    Province province=new Province();
                    province.setProvinceName(provinceobject.getString("name"));
                    province.setProvinceCode(provinceobject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
   解析和处理服务器返回的市级数据
    */
    public static boolean handleCityResponse(String response,int proviceid){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray=new JSONArray(response);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject cityobject=jsonArray.getJSONObject(i);
                    LogUtil.v(TAG,"provinceobject"+cityobject);
                    City city=new City();
                    city.setCityName(cityobject.getString("name"));
                    city.setCityCode(cityobject.getInt("id"));
                    city.setProvinceid(proviceid);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
  解析和处理服务器返回的县级数据
   */
    public static boolean handleCountyResponse(String response,int cityid){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray jsonArray=new JSONArray(response);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject countiesobject=jsonArray.getJSONObject(i);
                    LogUtil.v(TAG,"provinceobject"+countiesobject);
                    County county=new County();
                    county.setCountyname(countiesobject.getString("name"));
                    county.setCityid(countiesobject.getInt("id"));
                    county.setWeatherid(countiesobject.getInt("weather_id"));
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
