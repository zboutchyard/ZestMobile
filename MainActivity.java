package net.androidbootcamp.zesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButtonSteak;
    ImageButton imageButtonPork;
    ImageButton imageButtonPizza;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonPizza = (ImageButton) findViewById(R.id.imageButtonPizza);

        imageButtonPizza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, PizzaRecipe.class));

            }



        });
        imageButtonSteak = (ImageButton) findViewById(R.id.imageButtonSteak);

        imageButtonSteak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SteakRecipe.class));

            }
        });
        imageButtonPork = (ImageButton) findViewById(R.id.imageButtonPork);

        imageButtonPork.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, PorkRecipe.class));

            }
        });





    }
}