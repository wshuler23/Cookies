package edu.desu.dsuappacademy.cookies;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView after = (ImageView) findViewById(R.id.android_cookie_image_view);
        after.setImageResource(R.drawable.after);


        // TODO: Find a reference to the TextView in the layout. Change the text.

        TextView full = (TextView) findViewById(R.id.status_text_view);
        full.setText("I'm so full");
    }

    public void reset(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView after = (ImageView) findViewById(R.id.android_cookie_image_view);
        after.setImageResource(R.drawable.before);


        // TODO: Find a reference to the TextView in the layout. Change the text.

        TextView full = (TextView) findViewById(R.id.status_text_view);
        full.setText("I'm so hungry");
    }
}