package com.example.myapplication;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    // The single instance of VolleySingleton
    private static VolleySingleton instance;

    // The RequestQueue for managing network requests
    private RequestQueue requestQueue;

    // Private constructor to prevent direct instantiation
    private VolleySingleton(Context context) {
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    // Public method to get the single instance of VolleySingleton
    public static synchronized VolleySingleton getInstance(Context context) {
        if (instance == null) {
            instance = new VolleySingleton(context);
        }
        return instance;
    }

    // Method to get the RequestQueue
    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
