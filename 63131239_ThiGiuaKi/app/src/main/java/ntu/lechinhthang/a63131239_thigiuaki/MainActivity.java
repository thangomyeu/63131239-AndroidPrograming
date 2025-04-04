package ntu.lechinhthang.a63131239_thigiuaki;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCn2 = findViewById(R.id.btnCn2);
        Button btnCn3 = findViewById(R.id.btnCn3);
        Button btnCn4 = findViewById(R.id.btnCn4);
        Button btnAbm = findViewById(R.id.btnAbm);


        btnCn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ActivityChucnang2.class)));
        btnCn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ActivityChucnang3.class)));
        btnCn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ActivityChucnang4.class)));
        btnAbm.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ActivityAboutme.class)));
    }
}