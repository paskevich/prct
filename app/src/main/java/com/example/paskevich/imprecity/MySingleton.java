package com.example.paskevich.imprecity;

import android.content.Context;
import android.content.ContextWrapper;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by paskevich on 05.02.18.
 */

class MySingleton {
    private static final MySingleton ourInstance = new MySingleton();
    private RequestQueue queue;
    private static Context context;
    static MySingleton getInstance(Context myContext) {
        context = myContext;
        return ourInstance;
    }

    public void addToRequestQueue(JsonObjectRequest jsor){
        queue.add(jsor);
    }

    private MySingleton() {
        queue = Volley.newRequestQueue(context);
    }
}
