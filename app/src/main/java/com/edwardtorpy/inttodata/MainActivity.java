package com.edwardtorpy.inttodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void toData (View view) {

        for (int i = 0; i < 9002; i++) {

            char character = (char) i;
            System.out.println(i + " " + character);
        }

        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
