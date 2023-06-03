package com.example.splash;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void envoyer(View view ){
        name=findViewById(R.id.Name2);
        password=findViewById(R.id.mdp2);
        Intent i =new Intent(this,secondActivity.class);
        Bundle b=new Bundle();
        b.putString("name",name.getText().toString());
        b.putString("mdp",password.getText().toString());
        i.putExtras(b);
        startActivity(i);
    }
}