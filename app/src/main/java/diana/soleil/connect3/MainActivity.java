package diana.soleil.connect3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static diana.soleil.connect3.R.*;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9  ;
    Boolean buttonColor;
    androidx.gridlayout.widget.GridLayout gridLayout;
    Button button;
    TextView textView;
    int[][] gameStateArray;

    public void setImageViewsToNull(){
        imageView1.setImageBitmap(null);imageView2.setImageBitmap(null);imageView3.setImageBitmap(null);imageView4.setImageBitmap(null);imageView5.setImageBitmap(null);
        imageView6.setImageBitmap(null);imageView7.setImageBitmap(null);imageView8.setImageBitmap(null);imageView9.setImageBitmap(null);
    }
    public void buttonColorChange(int tag){

        if (buttonColor) {
            switch (tag) {
                case 1:
                    if (gameStateArray[0][0]==0) {
                        imageView1.setImageResource(drawable.blue);
                        gameStateArray[0][0] = 1;
                    }
                    break;
                case 2:
                    if (gameStateArray[0][1] == 0) {
                    imageView2.setImageResource(drawable.blue);
                    gameStateArray[0][1] = 1; }
                    break;
                case 3:
                    if (gameStateArray[0][2] == 0) {
                    imageView3.setImageResource(drawable.blue);
                    gameStateArray[0][2] = 1;}
                    break;
                case 4:
                    if (gameStateArray[1][0] == 0) {
                    imageView4.setImageResource(drawable.blue);
                    gameStateArray[1][0] = 1;}
                    break;
                case 5:
                    if (gameStateArray[1][1] == 0) {
                    imageView5.setImageResource(drawable.blue);
                    gameStateArray[1][1] = 1;}
                    break;
                case 6:
                    if (gameStateArray[1][2] == 0) {
                        imageView6.setImageResource(drawable.blue);
                        gameStateArray[1][2] = 1;}
                    break;
                case 7:
                    if (gameStateArray[2][0] == 0) {
                        imageView7.setImageResource(drawable.blue);
                        gameStateArray[2][0] = 1;}
                    break;
                case 8:
                    if (gameStateArray[2][1] == 0) {
                        imageView8.setImageResource(drawable.blue);
                        gameStateArray[2][1] = 1;}
                    break;
                case 9:
                    if (gameStateArray[2][2] == 0) {
                        imageView9.setImageResource(drawable.blue);
                        gameStateArray[2][2] = 1;}
                    break;
            }
            buttonColor = false;
        } else {
            switch (tag) {
                case 1:
                    if (gameStateArray[0][0]==0) {
                    imageView1.setImageResource(drawable.red);
                    gameStateArray[0][0] = 2;}
                    break;
                case 2:
                    if (gameStateArray[0][1]==0) {
                        imageView2.setImageResource(drawable.red);
                        gameStateArray[0][1] = 2;}
                    break;
                case 3:
                    if (gameStateArray[0][2]==0) {
                        imageView3.setImageResource(drawable.red);
                        gameStateArray[0][2] = 2;}
                    break;
                case 4:
                    if (gameStateArray[1][0]==0) {
                        imageView4.setImageResource(drawable.red);
                        gameStateArray[1][0] = 2;}
                    break;
                case 5:
                    if (gameStateArray[1][1]==0) {
                        imageView5.setImageResource(drawable.red);
                        gameStateArray[1][1] = 2;}
                    break;
                case 6:
                    if (gameStateArray[1][2]==0) {
                        imageView6.setImageResource(drawable.red);
                        gameStateArray[1][2]= 2;}
                    break;
                case 7:
                    if (gameStateArray[2][0]==0) {
                        imageView7.setImageResource(drawable.red);
                        gameStateArray[2][0] = 2;}
                    break;
                case 8:
                    if (gameStateArray[2][1]==0) {
                        imageView8.setImageResource(drawable.red);
                        gameStateArray[2][1] = 2;}
                    break;
                case 9:
                    if (gameStateArray[2][2]==0) {
                        imageView9.setImageResource(drawable.red);
                        gameStateArray[2][2] = 2;}
                    break;
            }
            buttonColor = true;
        }
        if (gameStateArray[0][0] != 0 && gameStateArray[0][1] != 0 && gameStateArray[0][2] != 0
                && gameStateArray[1][0] != 0 && gameStateArray[1][1] != 0 && gameStateArray[1][2] != 0 &&
        gameStateArray[2][0] != 0&& gameStateArray[2][1] != 0 && gameStateArray[2][2] != 0) {
            textView.setVisibility(View.VISIBLE);
            textView.setText("Please Restart the match. There are no more options!");
            button.setVisibility(View.VISIBLE);
            imageView1.setClickable(false);
            imageView2.setClickable(false);
            imageView3.setClickable(false);
            imageView4.setClickable(false);
            imageView5.setClickable(false);
            imageView6.setClickable(false);
            imageView7.setClickable(false);
            imageView8.setClickable(false);
            imageView9.setClickable(false);

        }
        if (       (gameStateArray[0][0] == 1 && gameStateArray[0][1] == 1 && gameStateArray[0][2] == 1)
                || (gameStateArray[1][0] == 1 && gameStateArray[1][1] == 1 && gameStateArray[1][2] == 1)
                || (gameStateArray[2][0] == 1 && gameStateArray[2][1] == 1 && gameStateArray[2][2] == 1)
                || (gameStateArray[0][0] == 1 && gameStateArray[1][0] == 1 && gameStateArray[2][0] == 1)
                || (gameStateArray[0][1] == 1 && gameStateArray[1][1] == 1 && gameStateArray[2][1] == 1)
                || (gameStateArray[0][2] == 1 && gameStateArray[1][2] == 1 && gameStateArray[2][2] == 1)
                || (gameStateArray[0][0] == 1 && gameStateArray[1][1] == 1 && gameStateArray[2][2] == 1)
                || (gameStateArray[0][2] == 1 && gameStateArray[1][1] == 1 && gameStateArray[2][0] == 1)) {
            textView.setVisibility(View.VISIBLE);
            textView.setText("Congradulation Blue You WON! Please Restart the match.");
            button.setVisibility(View.VISIBLE);
            imageView1.setClickable(false);
            imageView2.setClickable(false);
            imageView3.setClickable(false);
            imageView4.setClickable(false);
            imageView5.setClickable(false);
            imageView6.setClickable(false);
            imageView7.setClickable(false);
            imageView8.setClickable(false);
            imageView9.setClickable(false);

    }
        if (       (gameStateArray[0][0] == 2 && gameStateArray[0][1] == 2 && gameStateArray[0][2] == 2)
                || (gameStateArray[1][0] == 2 && gameStateArray[1][1] == 2 && gameStateArray[1][2] == 2)
                || (gameStateArray[2][0] == 2 && gameStateArray[2][1] == 2 && gameStateArray[2][2] == 2)
                || (gameStateArray[0][0] == 2 && gameStateArray[1][0] == 2 && gameStateArray[2][0] == 2)
                || (gameStateArray[0][1] == 2 && gameStateArray[1][1] == 2 && gameStateArray[2][1] == 2)
                || (gameStateArray[0][2] == 2 && gameStateArray[1][2] == 2 && gameStateArray[2][2] == 2)
                || (gameStateArray[0][0] == 2 && gameStateArray[1][1] == 2 && gameStateArray[2][2] == 2)
                || (gameStateArray[0][2] == 2 && gameStateArray[1][1] == 2 && gameStateArray[2][0] == 2)) {
            textView.setVisibility(View.VISIBLE);
            textView.setText("Congradulation Red You WON! Please Restart the match.");
            button.setVisibility(View.VISIBLE);
           imageView1.setClickable(false);
            imageView2.setClickable(false);
            imageView3.setClickable(false);
            imageView4.setClickable(false);
            imageView5.setClickable(false);
            imageView6.setClickable(false);
            imageView7.setClickable(false);
            imageView8.setClickable(false);
            imageView9.setClickable(false);

        }
    }
    public void restartButton(View view){
        setImageViewsToNull();
        buttonColor = true;
        gameStateArray = new int[3][3];
        button.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        imageView1.setClickable(true);
        imageView2.setClickable(true);
        imageView3.setClickable(true);
        imageView4.setClickable(true);
        imageView5.setClickable(true);
        imageView6.setClickable(true);
        imageView7.setClickable(true);
        imageView8.setClickable(true);
        imageView9.setClickable(true);
    }
    public void startButton(View view) {
    int tag = Integer.parseInt(view.getTag().toString());
    buttonColorChange(tag);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
         imageView1 = (ImageView) findViewById(id.imageView1);
         imageView2 = (ImageView) findViewById(id.imageView2);
         imageView3 = (ImageView) findViewById(id.imageView3);
         imageView4 = (ImageView) findViewById(id.imageView4);
         imageView5 = (ImageView) findViewById(id.imageView5);
         imageView6 = (ImageView) findViewById(id.imageView6);
         imageView7 = (ImageView) findViewById(id.imageView7);
         imageView8 = (ImageView) findViewById(id.imageView8);
         imageView9 = (ImageView) findViewById(id.imageView9);
         gridLayout = (GridLayout) findViewById(R.id.gridlayout);
         button = (Button) findViewById(id.button);
         textView = (TextView) findViewById(id.textView);
         setImageViewsToNull();
         buttonColor = true;
         gameStateArray = new int[3][3];


    }
}