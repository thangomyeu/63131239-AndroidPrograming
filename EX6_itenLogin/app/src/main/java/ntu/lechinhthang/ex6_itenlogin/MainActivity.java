package ntu.lechinhthang.ex6_itenlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button
        Button btndangnhap = findViewById(R.id.btndangnhap);

        // Set click listener
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Idangnhap = new Intent(MainActivity.this, Activity_login.class);
                startActivity(Idangnhap);
            }
        });
    }
}
