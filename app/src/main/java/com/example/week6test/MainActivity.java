package com.example.week6test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView rvRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerView = findViewById(R.id.rvRecyclerView);

        RetrofitSchool retrofitSchool = new RetrofitSchool();
        retrofitSchool.getService().getSchoolResponse("https://data.cityofnewyork.us/resource/f9bf-2cp4.json").enqueue(new Callback<SchoolResponse>(){

            @Override
            public void onResponse(Call<SchoolResponse> call, Response<SchoolResponse> response) {

            }

            @Override
            public void onFailure(Call<SchoolResponse> call, Throwable t) {

            }
        });

    }
    private void populateSchoolRecyclerView(SchoolResponse schoolResponse) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        SchoolRecyclerViewAdapter adapter = new SchoolRecyclerViewAdapter();
        rvRecyclerView.setLayoutManager(layoutManager);
        rvRecyclerView.setAdapter(adapter);
    }



}
