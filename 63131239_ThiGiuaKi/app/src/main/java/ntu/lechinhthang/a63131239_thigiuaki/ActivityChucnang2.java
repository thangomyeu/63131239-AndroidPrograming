package ntu.lechinhthang.a63131239_thigiuaki;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityChucnang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        EditText edtdiemGK = findViewById(R.id.edtdiemGK);
        EditText edtdiemCK = findViewById(R.id.edtdiemCK);
        Button btndiemTB = findViewById(R.id.btndiemTB);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btndiemTB.setOnClickListener(v -> {
            // {
            int diemGK = Integer.parseInt(edtdiemGK.getText().toString());
            int diemCK = Integer.parseInt(edtdiemCK.getText().toString());
            int diemTB = (diemGK + diemCK)/2;
            tvKetQua.setText("Kết quả: " + diemTB);
        });
    }
}