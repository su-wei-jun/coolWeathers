package com.example.coolweathers.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyname;
    private int cityid;
    private int weatherid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String name) {
        this.countyname = name;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public int getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(int weatherid) {
        this.weatherid = weatherid;
    }

    @Override
    public String toString() {
        return "County{" +
                "id=" + id +
                ", name='" + countyname + '\'' +
                ", cityid=" + cityid +
                ", weatherid=" + weatherid +
                '}';
    }
}
