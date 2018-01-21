package com.example.user.newretro;

/**
 * Created by User on 21-01-2018.
 */ import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APiService {

        @GET("/json")
        Call<List<Product>>getbookdetails();

    }

