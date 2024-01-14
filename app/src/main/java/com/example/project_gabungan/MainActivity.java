package com.example.project_gabungan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView buttonFirst;
    private CardView buttonSecond;
    private CardView buttonHallo;
    private CardView buttonFibo;
    private CardView buttonScroll;
    private CardView buttonAlarm;
    private CardView buttonMaps;
    private CardView buttonKalender;
    private CardView buttonchawnimamovie;
    private CardView buttontrailermovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSecond = findViewById(R.id.twoactivity);
        buttonFirst = findViewById(R.id.twoactivity);
        buttonHallo = findViewById(R.id.hallo);
        buttonFibo = findViewById(R.id.fibo);
        buttonScroll = findViewById(R.id.scroll);
        buttonAlarm = findViewById(R.id.SetAlarm);
        buttonMaps = findViewById(R.id.maps);
        buttonKalender = findViewById(R.id.kalender);
        buttonchawnimamovie = findViewById(R.id.chawnima_movie);
        buttontrailermovie = findViewById(R.id.trailer_movie);

        setToolbar();
        setIntent();
    }

    private void setToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Johanes Febrian");
            getSupportActionBar().setSubtitle(getResources().getString(R.string.app_name));
        }
    }

    private void setIntent() {
        buttonSecond.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            finish();
        });

        buttonFirst.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });

        buttonHallo.setOnClickListener(v -> {
            Intent intent = new Intent(this, HalloActivity.class);
            startActivity(intent);
        });

        buttonFibo.setOnClickListener(v -> {
            Intent intent = new Intent(this, Fibonancci.class);
            startActivity(intent);
        });

        buttonScroll.setOnClickListener(view -> {
            Intent intent = new Intent(this, ScrollSianida.class);
            startActivity(intent);
        });

        buttonAlarm.setOnClickListener(view -> {
            Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
            startActivity(intent);
        });

        buttonMaps.setOnClickListener(view -> {
            // Ganti geoLocation dengan lokasi yang sesuai
            Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/UNIVERSITAS+PELITA+BANGSA/@-6.2863948,106.8353142,10z/data=!4m10!1m2!2m1!1slokasi+pelita+bangsa!3m6!1s0x2e699b0c08ad8d01:0x2b18001d1b1371f9!8m2!3d-6.324617!4d107.169155!15sChRsb2thc2kgcGVsaXRhIGJhbmdzYZIBCnVuaXZlcnNpdHngAQA!16s%2Fg%2F1hm2jxhj1?entry=ttu");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        buttonKalender.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("content://com.android.calendar/time/"));
            startActivity(intent);
        });

        buttonchawnimamovie.setOnClickListener(view -> {
            Intent intent = new Intent(this, chawnimamovieActivity.class);
            startActivity(intent);
        });
        
        buttontrailermovie.setOnClickListener(view -> {
            Intent intent = new Intent(this, trailermovie.class);
            startActivity(intent);
        });
    }
}
