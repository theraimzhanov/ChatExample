package com.raimzhanov.application.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.raimzhanov.application.R;
import com.raimzhanov.application.databinding.ActivityMain2Binding;
import com.raimzhanov.application.model.ContactItem;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
     private static final int  GET_IMAGE= 111;
     private Uri uriImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

binding.tilButtonBack.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String nameContact =binding.editTextContactName.getText().toString().trim();
        String lastMessage = binding.editTextLastMessage.getText().toString().trim();
        String timeOfMessage =binding.editTextLastTimeOfMessage.getText().toString().trim();



         if (parseValue(nameContact) && parseValue(lastMessage) && parseValue(timeOfMessage)){
             Intent intent = new Intent(MainActivity2.this,MainActivity.class);

          MainActivity.list.add(new ContactItem(nameContact,lastMessage,timeOfMessage,uriImage));
             startActivity(intent);

         }
         else {
             Toast.makeText(MainActivity2.this, "There's empty.Please write down!!!", Toast.LENGTH_SHORT).show();
         }

    }
});

binding.tilImageForContact.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        startActivityForResult(Intent.createChooser(intent, "Pictures: "),GET_IMAGE );
    }
});
    }

    private boolean parseValue(String data){
        if (data.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==GET_IMAGE){
         if (data != null){
             uriImage = data.getData();
             Log.d("TAG", uriImage.toString());
         }
        }
    }
}