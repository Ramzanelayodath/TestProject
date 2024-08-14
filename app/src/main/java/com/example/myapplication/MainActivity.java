package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    String  url = "https://reqres.in/api/users?page=2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String object = "{ 'name' : 'XYZ', marks: [{ sub : 'English', marks :'50' },{ sub : 'Physics', marks :'25' }]}";

        try {
            JSONObject jsonObject = new JSONObject(object);
            JSONArray array = jsonObject.getJSONArray("marks");
             for(int i=0 ; i < array.length() ; i++){
                  JSONObject object1 = array.getJSONObject(i);
             }
            //Log.e("MYJSON",name);

            System.out.println("develop");

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }
}