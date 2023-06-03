package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    TextView name;
    TextView mdp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informations_layout);
        name = findViewById(R.id.name);
        mdp = findViewById(R.id.mdp);
        Bundle b = getIntent().getExtras();
        name.setText(b.getString("name"));
        mdp.setText(b.getString("mdp"));
    }

    public void retour(View view) {
        name.setText("");
        mdp.setText("");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
