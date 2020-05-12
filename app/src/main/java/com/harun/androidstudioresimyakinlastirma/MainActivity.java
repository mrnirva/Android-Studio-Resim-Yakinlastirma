package com.harun.androidstudioresimyakinlastirma;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

// https://harun.xyz/
public class MainActivity extends AppCompatActivity {

    private ImageView resim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView resim = findViewById(R.id.resim);

        PhotoViewAttacher pAttacher;
        pAttacher = new PhotoViewAttacher(resim);
        pAttacher.update();

    }
}
