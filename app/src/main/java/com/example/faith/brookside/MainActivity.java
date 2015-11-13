package com.example.faith.brookside;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {
    Button button1,  button2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.imgmain);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });



    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId())
//        {
//           case  R.id.button1:
//            startActivity(new Intent(getApplicationContext(),Register.class));
//               break;
//            case  R.id.button2:
//                startActivity(new Intent(getApplicationContext(),Stats.class));
//                break;
//        }
//
//    }
}
