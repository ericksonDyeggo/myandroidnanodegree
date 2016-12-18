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

    public void mockUpClick(View v) {
        Button b = (Button) v;

        String message = (String) this.getText(R.string.mockup_message);

        String msg_toast = String.format(message, b.getText().toString());

        Toast.makeText(
                this
                , msg_toast
                , Toast.LENGTH_SHORT
        ).show();
    }
}
