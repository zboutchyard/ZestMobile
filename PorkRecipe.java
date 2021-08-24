package net.androidbootcamp.zesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PorkRecipe extends AppCompatActivity {

    Button btnBruschetta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_recipe);

        btnBruschetta = (Button) findViewById(R.id.btnBruschetta);

        btnBruschetta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(PorkRecipe.this, bruschettaRecipe.class));

            }



        });
    }
}