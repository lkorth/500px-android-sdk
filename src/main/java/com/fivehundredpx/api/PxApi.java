package com.fivehundredpx.api;

import com.fivehundredpx.api.models.User;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.http.GET;

public interface PxApi {

    public static final String FIVE_HUNDRED_PX_API_URL = "https://api.500px.com/v1";

    @GET("/users")
    public User getUser() throws RetrofitError;

    @GET("/users")
    public void getUser(Callback<User> callback);

}
