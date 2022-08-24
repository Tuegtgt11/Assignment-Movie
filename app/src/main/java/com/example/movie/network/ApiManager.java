package com.example.movie.network;

import com.example.movie.model.BigData;
import com.example.movie.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER = "https://springfilm.herokuapp.com";
    @GET("/apifree/home")
    Call<BigData> apiGetBigData();
}
