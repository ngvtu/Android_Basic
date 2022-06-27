package actvn.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtName;
    ImageView imgAvatar;
    RadioButton rdNam, rdNu;
    Button btnXem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        btnXem.setOnClickListener(this);
    }

    private void mapping() {
        txtName = findViewById(R.id.txtName);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "OK em iu ",    Toast.LENGTH_SHORT).show();
    }
}