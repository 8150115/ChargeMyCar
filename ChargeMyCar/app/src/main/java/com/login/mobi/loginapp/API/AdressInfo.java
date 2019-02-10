package com.login.mobi.loginapp.API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdressInfo {
    @SerializedName("Title")
    @Expose
    private String Title;

    @SerializedName("AddressLine1")
    @Expose
    private String AdressLine1;

    @SerializedName("Town")
    @Expose
    private String Town;

    @SerializedName("Latitude")
    @Expose
    private float Latitude;

    @SerializedName("Longitude")
    @Expose
    private float Longitude;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAdressLine1() {
        return AdressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        AdressLine1 = adressLine1;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }
}