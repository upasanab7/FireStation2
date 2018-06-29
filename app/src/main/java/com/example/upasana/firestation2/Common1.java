package com.example.upasana.firestation2;

import com.example.upasana.firestation2.Remote.IGoogleApiService;
import com.example.upasana.firestation2.Remote.RetrofitClient;

public class Common1 {
    private static final String GOOGLE_API_URL="https://maps.googleapis.com/";
    public static IGoogleApiService getGoogleApiService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleApiService.class);

    }
}
