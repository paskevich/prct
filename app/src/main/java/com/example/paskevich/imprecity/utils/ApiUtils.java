package com.example.paskevich.imprecity.utils;

import com.example.paskevich.imprecity.IAPI.APIService;
import com.example.paskevich.imprecity.IAPI.RetrofitClient;



public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http:/35.196.127.199:5000/";

    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}