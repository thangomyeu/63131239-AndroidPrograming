package ntu.lechinhthang.a63131239_thigiuaki;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityChucnang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        ListView listView = findViewById(R.id.listViewSubjects);
        String[] danhSach = {"Tin Học Đại Cương", "Lập Trình JAVA", "Phát triển ứng dụng web", "khai phá dữ liệu", "kinh tế chính trị ", "..."};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhSach);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String item = danhSach[position];
            Toast.makeText(ActivityChucnang3.this, "Bạn chọn: " + item, Toast.LENGTH_SHORT).show();
        });
    }
}