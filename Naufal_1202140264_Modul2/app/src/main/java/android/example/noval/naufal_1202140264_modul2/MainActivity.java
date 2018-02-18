package android.example.noval.naufal_1202140264_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;// splash interval 4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //memindahkan mainlayout(splash) pertama ke home layout
                Intent homeIntent = new Intent(MainActivity.this, MenuUtama.class);
                // menjalankan aktifitias
                startActivity(homeIntent);
                finish(); // splash selesai
                Toast.makeText(getApplicationContext(), "Mhd Naufal Kusuma Putra_1202140264", Toast.LENGTH_LONG).show(); //menampilkan nama dan nim setelah splash selesai

            }
        },SPLASH_TIME_OUT);
    }
}
