package com.example.upasana.firestation2.Remote;

import com.example.upasana.firestation2.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleApiService
{
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);

}
