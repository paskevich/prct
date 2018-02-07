package com.example.paskevich.imprecity.IAPI;

import com.example.paskevich.imprecity.Models.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    @POST("/login")
    @FormUrlEncoded
    Call<User> login(@Field("username") String username,
                     @Field("password") String password);

    @POST("/logout")
    @FormUrlEncoded
    Call<User> logout(@Field("username") String username);

    @POST("/signup")
    @FormUrlEncoded
    Call<User> signup(@Field("username") String username,
                      @Field("email") String email,
                      @Field("password") String password);



}
