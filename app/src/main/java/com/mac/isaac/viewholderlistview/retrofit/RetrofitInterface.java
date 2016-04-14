package com.mac.isaac.viewholderlistview.retrofit;

import com.mac.isaac.viewholderlistview.entities.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("?format=json")
    Call<Result> listCharacters(@Query("q") String q);
}