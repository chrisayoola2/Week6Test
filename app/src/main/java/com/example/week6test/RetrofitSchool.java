package com.example.week6test;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class RetrofitSchool {
    public static final String BASE_URL = "https://data.cityofnewyork.us/";


    public Retrofit getRetrofitInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build();
        return new Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public SchoolApiService getService(){
        return getRetrofitInstance().create(SchoolApiService.class);
    }
    public interface SchoolApiService{
        @GET
        Call<SchoolResponse> getSchoolResponse(@Url String myUrl);
    }
}
