package com.sheikh.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private ImageButton imgA, imgB, imgC, imgD, imgE, imgF, imgG,
            imgH, imgI, imgJ, imgK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgA = findViewById(R.id.imgA);
        imgB = findViewById(R.id.imgB);
        imgC = findViewById(R.id.imgC);
        imgD = findViewById(R.id.imgD);
        imgE = findViewById(R.id.imgE);
        imgF = findViewById(R.id.imgF);
        imgG = findViewById(R.id.imgG);
        imgH = findViewById(R.id.imgH);
        imgI = findViewById(R.id.imgI);
        imgJ = findViewById(R.id.imgJ);
        imgK = findViewById(R.id.imgK);

        imgA.setOnClickListener(MainActivity.this);
        imgB.setOnClickListener(MainActivity.this);
        imgC.setOnClickListener(MainActivity.this);
        imgD.setOnClickListener(MainActivity.this);
        imgE.setOnClickListener(MainActivity.this);
        imgF.setOnClickListener(MainActivity.this);
        imgG.setOnClickListener(MainActivity.this);
        imgH.setOnClickListener(MainActivity.this);
        imgI.setOnClickListener(MainActivity.this);
        imgJ.setOnClickListener(MainActivity.this);
        imgK.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButtonView) {

        switch (imageButtonView.getId()) {

            case R.id.imgA:
                playLetterName(imgA.getTag().toString());
                break;
            case R.id.imgB:
                playLetterName(imgB.getTag().toString());
                break;
            case R.id.imgC:
                playLetterName(imgC.getTag().toString());
                break;
            case R.id.imgD:
                playLetterName(imgD.getTag().toString());
                break;
            case R.id.imgE:
                playLetterName(imgE.getTag().toString());
                break;
            case R.id.imgF:
                playLetterName(imgF.getTag().toString());
                break;
            case R.id.imgG:
                playLetterName(imgG.getTag().toString());
                break;
            case R.id.imgH:
                playLetterName(imgH.getTag().toString());
                break;
            case R.id.imgI:
                playLetterName(imgI.getTag().toString());
                break;
            case R.id.imgJ:
                playLetterName(imgJ.getTag().toString());
                break;
            case R.id.imgK:
                playLetterName(imgK.getTag().toString());
                break;
        }
    }


    private void playLetterName(String letterName){

        MediaPlayer letterPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(letterName,
                "raw",getPackageName()));
        letterPlayer.start();
    }

}
