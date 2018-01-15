package com.arjuna.quiz15jan_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtkerja;
    EditText etkerja;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtkerja = (TextView)  findViewById(R.id.txtkerja);
        etkerja = (EditText)  findViewById(R.id.etkerja);
        btnok = (Button)  findViewById(R.id.btnok);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nkerja = etkerja.getText().toString();

                if (nkerja.equalsIgnoreCase("1") ){
                    txtkerja.setText(" Jurusan Manajemen Informatika");
                } else if (nkerja.equalsIgnoreCase("2") ){
                    txtkerja.setText(" Jurusan Teknik Komputer");
                }else if (nkerja.equalsIgnoreCase("3") ){
                    txtkerja.setText(" Jurusan Akutansi");
                }else if (nkerja.equalsIgnoreCase("4") ){
                    txtkerja.setText(" Jurusan Sistem Informasi");
                }else if (nkerja.equalsIgnoreCase("5") ){
                    txtkerja.setText("  Jurusan Teknologi Informasi");
                }else {
                    etkerja.setError("Please input number 1-5");
                }
            }
        });


    }
}
