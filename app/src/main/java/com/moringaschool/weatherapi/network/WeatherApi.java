package com.moringaschool.weatherapi.network;

import com.moringaschool.weatherapi.Constants;
import com.moringaschool.weatherapi.models.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather?" + Constants.API_KEY_QUERY_PARAMETER + "=" + Constants.WEATHER_API_KEY)
    Call<WeatherResponse> getCurrentWeather(@Query("q") String city);
}
