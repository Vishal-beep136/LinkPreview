package com.vishal.kaitka.linkpreview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.vishal.kaitka.linkpreview.databinding.ActivityMainBinding;
import com.vishal.kaitka.linkpreviewlib.Data;
import com.vishal.kaitka.linkpreviewlib.LinkPrev;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LinkPrev.getUrlDetails("https://www.youtube.com/watch?v=kJQP7kiw5Fk",
                new LinkPrev.ResultListener() {
                    @Override
                    public void onResultSuccess(Data urlData) {
                        Glide.with(MainActivity.this)
                                .load(urlData.getImageUrl())
                                .into(binding.image);

                        binding.title.setText(urlData.getTitle());
                    }

                    @Override
                    public void onResultFailed(Throwable e) {
                        Log.d("Vishal", "onResultFailed: Error While" + e.getMessage());
                    }
                });


    }


}