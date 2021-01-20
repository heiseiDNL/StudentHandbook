package com.example.studenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private ImageButton btnGradeCalculator, btnHistory, btnMusicPlayer, btnVideoPlayer, btnWebsite,btnQR;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnGradeCalculator = (ImageButton) findViewById(R.id.btnGradeCalculator);
        btnHistory = (ImageButton) findViewById(R.id.btnHistory);
        btnMusicPlayer = (ImageButton) findViewById(R.id.btnMusicPlayer);
        btnVideoPlayer = (ImageButton) findViewById(R.id.btnVideoPlayer);
        btnWebsite = (ImageButton) findViewById(R.id.btnWebsite);
        btnQR = (ImageButton) findViewById(R.id.btnQR);
        btnLogout = (Button) findViewById(R.id.btnLogout);


        btnGradeCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalcu();
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistory();
            }
        });

        btnMusicPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHymn();
            }
        });

        btnVideoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAd();
            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.sti.edu/";
                Intent intentToSTIWebsite = new Intent(Intent.ACTION_VIEW);
                intentToSTIWebsite.setData(Uri.parse(url));
                startActivity(intentToSTIWebsite);
            }
        });

        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQR();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    public void openCalcu() {
        Intent calcu = new Intent(this, Activity1.class);
        startActivity(calcu);
    }
    public void openHistory() {
        Intent history = new Intent(this, Activity2.class);
        startActivity(history);
    }
    public void openHymn() {
        Intent music = new Intent(this, Activity3.class);
        startActivity(music);
    }

    public void openAd() {
        Intent video = new Intent(this, Activity4.class);
        startActivity(video);
    }

    public void openQR() {
        Intent qr = new Intent(this, Activity5.class);
        startActivity(qr);
    }

    public void logout() {
        Toast.makeText(this, "Successfully Logout!", Toast.LENGTH_SHORT).show();
        Intent log = new Intent(this, Login.class);
        startActivity(log);
    }

}