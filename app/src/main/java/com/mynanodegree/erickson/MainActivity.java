package com.mynanodegree.erickson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mockUpClick(View view) {
        Button button = (Button) view;

        String msg_toast = getString(R.string.mockup_message, button.getText().toString());

        Toast.makeText(
                this
                , msg_toast
                , Toast.LENGTH_SHORT
        ).show();
    }
}
