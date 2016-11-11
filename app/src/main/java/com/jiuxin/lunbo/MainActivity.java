package com.jiuxin.lunbo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BannerLayout banner;
    private static final String ZHANG_YUANCHONG = "http://121.42.26.208:83/interface/json_index.php?areaid=1&page=1&uid=";

    BannerEntity news;
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banner = (BannerLayout) findViewById(R.id.banner2);
        gson = new Gson();
        loadData();


    }


    private void loadData() {
        RequestQueue mQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(ZHANG_YUANCHONG,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("TAG", response);
                        dealWithResponse(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        });
        mQueue.add(stringRequest);

    }

    private void dealWithResponse(String response) {
        news = gson.fromJson(response, BannerEntity.class);
        Toast.makeText(this, "aaa>>" + news.getBannerlist().get(0).getInfo() + "<<>" + news.getBannerlist().get(0).getPicurl(), Toast.LENGTH_SHORT).show();
        // Log.d(news.getBannerlist().get(0).getInfo() + "<<>" + news.getBannerlist().get(0).getPicurl(), "===================");
        List<BannerEntity.BannerlistBean> mEnjoyLists = new ArrayList<>();
        mEnjoyLists = news.getBannerlist();
        Toast.makeText(this, "aaa>>" + news.getBannerlist().get(0).getInfo() + "<<>" + news.getBannerlist().get(0).getPicurl(), Toast.LENGTH_SHORT).show();
        List<String> urls=new ArrayList<>();

        for (int i = 0; i < mEnjoyLists.size(); i++) {
            urls.add("http://121.42.26.208:83/"+mEnjoyLists.get(i).getPicurl());
        }
        banner.setViewUrls(urls);

        banner.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
