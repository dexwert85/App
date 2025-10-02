package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button up, down, left, right;
    private ImageView img;
    private TextView tvLives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        img = findViewById(R.id.imageView);
        tvLives = findViewById(R.id.textView);
        final int[] lives = {5};
        tvLives.setText(lives[0] + "");

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY() - 20);
                img.setImageResource(R.drawable.ic_launcher_foreground);
                if (img.getY() <= -100) {
                    lives[0]--;
                    tvLives.setText( lives[0] + "");
                    img.setImageResource(R.drawable.boom);
                }
                if (lives[0] <= 0) {
                    finish();
                    System.exit(0);
                }
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY() + 20);
                img.setImageResource(R.drawable.ic_launcher_foreground);
                if (img.getY() >= 1075) {
                    lives[0]--;
                    tvLives.setText(lives[0] + "");
                    img.setImageResource(R.drawable.boom);
                }
                if (lives[0] <= 0) {
                    finish();
                    System.exit(0);
                }
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX() - 20);
                img.setImageResource(R.drawable.ic_launcher_foreground);
                if (img.getX() <= -75) {
                    lives[0]--;
                    tvLives.setText(lives[0] + "");
                    img.setImageResource(R.drawable.boom);
                }
                if (lives[0] <= 0) {
                    finish();
                    System.exit(0);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX() + 20);
                img.setImageResource(R.drawable.ic_launcher_foreground);
                if (img.getX() >= 640) {
                    lives[0]--;
                    tvLives.setText(lives[0] + "");
                    img.setImageResource(R.drawable.boom);
                }
                if (lives[0] <= 0) {
                    finish();
                    System.exit(0);
                }
            }
        });
    }
}