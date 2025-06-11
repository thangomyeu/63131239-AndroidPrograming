package ntu.lechinhthang.ex6_intentdongian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nutMH2;
    Button NutMH3;
    void DieuKhien(){
        nutMH2 = (Button) findViewById(R.id.btnMH2);

        NutMH3 = (Button) findViewById(R.id.btnMH3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DieuKhien();
        nutMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMH2 = new Intent(MainActivity.this, manhinh2.class);
                startActivity(intentMH2);
            }
        });
        NutMH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMH3 = new Intent(MainActivity.this, manhinh3.class);
                startActivity(intentMH3);
            }
        });
    }

}