package com.example.difa.latihan45_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class RecipeMethodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_method);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String item_name = null;
        if (extras != null) {
            item_name = extras.getString(RecipeListAdapter.EXTRA_NAME);
        }
        TextView heading = findViewById(R.id.food_name);
        TextView desc = findViewById(R.id.recipe_description);
        ImageView imageView = findViewById(R.id.food_image);
        heading.setText(item_name);
        if (item_name != null) {
            switch (item_name){
                case "Nasi Goreng Sederhana":
                    imageView.setImageResource(R.drawable.nssederhana);
                    desc.setText(R.string.NasiGorengSederhana);
                    break;
                case "Nasi Goreng Jawa":
                    imageView.setImageResource(R.drawable.nsjawa);
                    desc.setText(R.string.NasiGorengJawa);
                    break;
                case "Nasi Goreng Ikan Tuna Kaleng":
                    imageView.setImageResource(R.drawable.nstunakaleng);
                    desc.setText(R.string.NasiGorengTunaKaleng);
                    break;
                case "Nasi Goreng Pedas":
                    imageView.setImageResource(R.drawable.nspedas);
                    desc.setText(R.string.NasiGorengPedas);
                    break;
                case "Nasi Goreng Telur":
                    imageView.setImageResource(R.drawable.nstelur);
                    desc.setText(R.string.NasiGorengTelur);
                    break;
                default: break;
            }
        }
    }
}