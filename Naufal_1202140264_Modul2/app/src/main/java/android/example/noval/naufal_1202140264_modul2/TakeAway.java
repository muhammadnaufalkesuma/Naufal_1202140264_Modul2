package android.example.noval.naufal_1202140264_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pilihPesanan(View view) {
        startActivity(new Intent(TakeAway.this , DaftarMenu.class));
        //ini digunakan untuk melakukan intent ke DaftarMenu.class
    }
}
