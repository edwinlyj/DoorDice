package com.example.a16022895.doordice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class gameActivity extends AppCompatActivity {

    ImageView iv_cpu, iv_player;
    TextView tv_cpu, tv_player;
    Button idButton;
    int cpuPoints;
    int playerPoints;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_player = (ImageView) findViewById(R.id.iv_player);

        idButton = (Button)findViewById(R.id.idbutton);

        tv_cpu = (TextView) findViewById(R.id.tv_cpu);
        tv_player = (TextView) findViewById(R.id.tv_player);

        r = new Random();

        idButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cpuThrow = r.nextInt(6) + 1;
                int playerThrow = r.nextInt(6) + 1;

                setImageCPU(cpuThrow);
                setImagePlayer(playerThrow);

                if(cpuThrow > playerThrow){
                    cpuPoints++;
                }

                if(playerThrow > cpuThrow){
                    playerPoints++;
                }

                tv_cpu.setText("CPU: " + cpuPoints);
                tv_player.setText("You: " + playerPoints);

                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                iv_cpu.startAnimation(rotate);
                iv_player.startAnimation(rotate);
            }
        });
    }
        public void setImageCPU(int num) {
            switch (num) {
                case 1:
                    iv_cpu.setImageResource(R.drawable.dice1);
                    break;
                case 2:
                    iv_cpu.setImageResource(R.drawable.dice2);
                    break;
                case 3:
                    iv_cpu.setImageResource(R.drawable.dice3);
                    break;
                case 4:
                    iv_cpu.setImageResource(R.drawable.dice4);
                    break;
                case 5:
                    iv_cpu.setImageResource(R.drawable.dice5);
                    break;
                case 6:
                    iv_cpu.setImageResource(R.drawable.dice6);
                    break;
            }

    }

            public void setImagePlayer(int num) {
                switch (num) {
                    case 1:
                        iv_player.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        iv_player.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        iv_player.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        iv_player.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        iv_player.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        iv_player.setImageResource(R.drawable.dice6);
                        break;
                }
            }

    }
