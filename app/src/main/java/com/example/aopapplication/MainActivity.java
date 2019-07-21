package com.example.aopapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view){
//        Button button = view.findViewById(R.id.testbutton);
//        button.setText(count++);
        Toast.makeText(this, String.valueOf(count++), Toast.LENGTH_SHORT).show();
    }
}
