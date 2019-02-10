package com.login.mobi.loginapp.API;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

public interface OpenchargemapApi {
    public static final String url = "https://api.openchargemap.io/v2/poi/?output=json&maxresults=10&compact=true&verbose=false";

    @Headers("Content-Type: application/json")
    @GET("poi/")
    Call<List<Postos>> GetPostos(@QueryMap Map<String, String> options);
}
