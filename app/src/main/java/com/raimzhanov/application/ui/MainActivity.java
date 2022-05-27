package com.raimzhanov.application.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.raimzhanov.application.R;
import com.raimzhanov.application.databinding.ActivityMainBinding;
import com.raimzhanov.application.model.ContactItem;
import com.raimzhanov.application.ui.adapter.ContactAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding binding;
   public static ContactAdapter adapter;
   public static ArrayList<ContactItem>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerChat.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ContactAdapter(this,list);
        binding.recyclerChat.setAdapter(adapter);

        Log.d("TAG", "onCreate: "+list.toString());

        binding.btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,GetImageActivity.class);
            startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}