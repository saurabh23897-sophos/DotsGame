package com.example.saurabhapp.saurabh;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.FileOutputStream;

public class MainDefault extends AppCompatActivity {
    public int a = 0,m,n;
    public Button undo,s1, o1, b1, b2, b3, n1, n2;
    public Button[] b = new Button[101];
    public Button but;
    public int score1=0,score2=0;
    public String name1="Player1", name2="Player2";
    public int color_1=Color.BLUE,color_2=Color.YELLOW,player1=Color.BLUE,player2=Color.YELLOW;
    public int red=Color.RED,blue=Color.BLUE,yellow=Color.YELLOW,green=Color.GREEN,white=Color.WHITE,black=Color.BLACK;
    public TextView name_1,name_2;
    public RadioGroup group1,group2;
    public RadioButton radio1,radio2,radio3,radio4,rad1,rad2,rad3,rad4;
    public EditText editText,editText2;
    private String ss1,ss2;
    private String file = "fileall";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_page);
        name_1=(TextView) findViewById(R.id.view1);
        name_2=(TextView) findViewById(R.id.view2);
//        group1=(RadioGroup)findViewById(R.id.group1);
  //      group2=(RadioGroup)findViewById(R.id.group2);
        rad1=(RadioButton)findViewById(R.id.rad1);
        rad2=(RadioButton)findViewById(R.id.rad2);
        rad3=(RadioButton)findViewById(R.id.rad3);
        rad4=(RadioButton)findViewById(R.id.rad4);
        radio1=(RadioButton)findViewById(R.id.radio1);
        radio2=(RadioButton)findViewById(R.id.radio2);
        radio3=(RadioButton)findViewById(R.id.radio3);
        radio4=(RadioButton)findViewById(R.id.radio4);
        b[1] = (Button) findViewById(R.id.button1);
        b[2] = (Button) findViewById(R.id.button2);
        b[3] = (Button) findViewById(R.id.button3);
        b[4] = (Button) findViewById(R.id.button4);
        b[5] = (Button) findViewById(R.id.button5);
        b[6] = (Button) findViewById(R.id.button6);
        b[7] = (Button) findViewById(R.id.button7);
        b[8] = (Button) findViewById(R.id.button8);
        b[9] = (Button) findViewById(R.id.button9);
        b[10] = (Button) findViewById(R.id.button10);
        b[11] = (Button) findViewById(R.id.button11);
        b[12] = (Button) findViewById(R.id.button12);
        b[13] = (Button) findViewById(R.id.button13);
        b[14] = (Button) findViewById(R.id.button14);
        b[15] = (Button) findViewById(R.id.button15);
        b[16] = (Button) findViewById(R.id.button16);
        b[17] = (Button) findViewById(R.id.button17);
        b[18] = (Button) findViewById(R.id.button18);
        b[19] = (Button) findViewById(R.id.button19);
        b[20] = (Button) findViewById(R.id.button20);
        b[21] = (Button) findViewById(R.id.button21);
        b[22] = (Button) findViewById(R.id.button22);
        b[23] = (Button) findViewById(R.id.button23);
        b[24] = (Button) findViewById(R.id.button24);
        b[25] = (Button) findViewById(R.id.button25);
        b[26] = (Button) findViewById(R.id.button26);
        b[27] = (Button) findViewById(R.id.button27);
        b[28] = (Button) findViewById(R.id.button28);
        b[29] = (Button) findViewById(R.id.button29);
        b[30] = (Button) findViewById(R.id.button30);
        b[31] = (Button) findViewById(R.id.button31);
        b[32] = (Button) findViewById(R.id.button32);
        b[33] = (Button) findViewById(R.id.button33);
        b[34] = (Button) findViewById(R.id.button34);
        b[35] = (Button) findViewById(R.id.button35);
        b[36] = (Button) findViewById(R.id.button36);
        b[37] = (Button) findViewById(R.id.button37);
        b[38] = (Button) findViewById(R.id.button38);
        b[39] = (Button) findViewById(R.id.button39);
        b[40] = (Button) findViewById(R.id.button40);
        b[41] = (Button) findViewById(R.id.button41);
        b[42] = (Button) findViewById(R.id.button42);
        b[43] = (Button) findViewById(R.id.button43);
        b[44] = (Button) findViewById(R.id.button44);
        b[45] = (Button) findViewById(R.id.button45);
        b[46] = (Button) findViewById(R.id.button46);
        b[47] = (Button) findViewById(R.id.button47);
        b[48] = (Button) findViewById(R.id.button48);
        b[49] = (Button) findViewById(R.id.button49);
        b[50] = (Button) findViewById(R.id.button50);
        b[51] = (Button) findViewById(R.id.button51);
        b[52] = (Button) findViewById(R.id.button52);
        b[53] = (Button) findViewById(R.id.button53);
        b[54] = (Button) findViewById(R.id.button54);
        b[55] = (Button) findViewById(R.id.button55);
        b[56] = (Button) findViewById(R.id.button56);
        b[57] = (Button) findViewById(R.id.button57);
        b[58] = (Button) findViewById(R.id.button58);
        b[59] = (Button) findViewById(R.id.button59);
        b[60] = (Button) findViewById(R.id.button60);
        b[61] = (Button) findViewById(R.id.button61);
        b[62] = (Button) findViewById(R.id.button62);
        b[63] = (Button) findViewById(R.id.button63);
        b[64] = (Button) findViewById(R.id.button64);
        b[65] = (Button) findViewById(R.id.button65);
        b[66] = (Button) findViewById(R.id.button66);
        b[67] = (Button) findViewById(R.id.button67);
        b[68] = (Button) findViewById(R.id.button68);
        b[69] = (Button) findViewById(R.id.button69);
        b[70] = (Button) findViewById(R.id.button70);
        b[71] = (Button) findViewById(R.id.button71);
        b[72] = (Button) findViewById(R.id.button72);
        b[73] = (Button) findViewById(R.id.button73);
        b[74] = (Button) findViewById(R.id.button74);
        b[75] = (Button) findViewById(R.id.button75);
        b[76] = (Button) findViewById(R.id.button76);
        b[77] = (Button) findViewById(R.id.button77);
        b[78] = (Button) findViewById(R.id.button78);
        b[79] = (Button) findViewById(R.id.button79);
        b[80] = (Button) findViewById(R.id.button80);
        b[81] = (Button) findViewById(R.id.button81);
        b[82] = (Button) findViewById(R.id.button82);
        b[83] = (Button) findViewById(R.id.button83);
        b[84] = (Button) findViewById(R.id.button84);
        b[85] = (Button) findViewById(R.id.button85);
        undo = (Button) findViewById(R.id.button86);
        s1 = (Button) findViewById(R.id.start);
        but = (Button) findViewById(R.id.open);
        o1 = (Button) findViewById(R.id.open);
        b1 = (Button) findViewById(R.id.back1);
        b2 = (Button) findViewById(R.id.back2);
        b3 = (Button) findViewById(R.id.back3);
        n1 = (Button) findViewById(R.id.next1);
        n2 = (Button) findViewById(R.id.next2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void change(View view) {
        view.setBackgroundColor(Color.BLACK);
        but = (Button) findViewById(view.getId());
        a++;
        check();
    }


    public void check() {
        int i = 1, j = 1, k = 0;
        while (i<61) {
            if(but==b[i]){
                j=i;
            }
            i++;
        }
        i=j;
        if (i < 31) {
            j = 5 * (i / 6) + (i % 6);
            if (i % 6 == 1) {
                change(i,i+1,j+30,j+35,j+60);
            }
            else if (i % 6 == 0){
                change(i-1,i,j+30,j+35,j+60);
            }
            else{
                change(i,i+1,j+30,j+35,j+60);change(i-1,i,j+29,j+34,j-1+60);
            }
        }
        else{
            i=i-30;
            if(i%5==0){
                k=1;
            }
            else{
                k=0;
            }
            j = 6 * (i / 5) + (i % 5) - k;
            if(i<6){
                change(i+30,i+35,j,j+1,i+60);
            }
            else if(i>25){
                change(i+25,i+30,j-6,j-5,i-5+60);
            }
            else{
                change(i+30,i+35,j,j+1,i+60);change(i+25,i+30,j-6,j-5,i-5+60);
            }
        }
    }

    public void change(int p,int q,int r,int s,int t){
        ColorDrawable pc = (ColorDrawable) b[p].getBackground();
        ColorDrawable qc = (ColorDrawable) b[q].getBackground();
        ColorDrawable rc = (ColorDrawable) b[r].getBackground();
        ColorDrawable sc = (ColorDrawable) b[s].getBackground();
        int pcc = pc.getColor();
        int qcc = qc.getColor();
        int rcc = rc.getColor();
        int scc = sc.getColor();
        if((pcc==black)&&(pcc==qcc)&&(qcc==rcc)&&(rcc==scc)){
            if(a%2==0){
                b[t].setBackgroundColor(player1);
                score1++;
            }
            else{
                b[t].setBackgroundColor(player2);
                score2++;
            }
            a++;
        }
    }

    public void setUndo(View v) {
        ColorDrawable color = (ColorDrawable) undo.getBackground();
        int col = color.getColor();
        if (but != null) {
            but.setBackgroundColor(col);
        }
        int i = 1, j = 0;
        while (but != b[i]) {
            i++;
        }
        if (i < 31) {
            if (i % 6 < 2) {
                j = 5 * (i / 6) + (i % 6);
                ColorDrawable color1 = (ColorDrawable) b[j+60].getBackground();
                int col1 = color1.getColor();
                if (col1 != Color.WHITE) {
                    b[j+60].setBackgroundColor(white);
                }
            }
            else{
                j = 5 * (i / 6) + (i % 6);
                ColorDrawable color1 = (ColorDrawable) b[j+60].getBackground();
                int col1 = color1.getColor();
                if (col1 != Color.WHITE) {
                    b[j+60].setBackgroundColor(white);
                    reduce();
                }
                ColorDrawable color2 = (ColorDrawable) b[j-1+60].getBackground();
                int col2 = color2.getColor();
                if (col2 != Color.WHITE) {
                    b[j-1+60].setBackgroundColor(white);
                    reduce();
                }
            }
        }
        else{
            i=i-30;
            if(i<6){
                ColorDrawable color1 = (ColorDrawable) b[i+60].getBackground();
                int col1 = color1.getColor();
                if (col1 != Color.WHITE) {
                    b[i+60].setBackgroundColor(white);
                    reduce();
                }
            }
            else if(i>25){
                ColorDrawable color1 = (ColorDrawable) b[i+60-5].getBackground();
                int col1 = color1.getColor();
                if (col1 != Color.WHITE) {
                    b[i+60-5].setBackgroundColor(white);
                    reduce();
                }
            }
            else{
                ColorDrawable color1 = (ColorDrawable) b[i+60].getBackground();
                int col1 = color1.getColor();
                if (col1 != Color.WHITE) {
                    b[i+60].setBackgroundColor(white);
                    reduce();
                }
                ColorDrawable color2 = (ColorDrawable) b[i+60-5].getBackground();
                int col2 = color2.getColor();
                if (col2 != Color.WHITE) {
                    b[i+60-5].setBackgroundColor(white);
                    reduce();
                }
            }
        }
        a--;
    }

    /*    public void score(){
            name_1.setText(name1 + " " + score1);
            name_2.setText(name2 + " " + score2);
        }
    */
    public void reduce(){
        if(a%2==0){
            score1--;
        }
        else {
            score2--;
        }
    }

    public void get(View v) {
        switch (v.getId()){
            case R.id.open:
                setContentView(R.layout.player1);
                break;
            case R.id.start:
                setContentView(R.layout.activity_main);
                break;
            case R.id.next1:
                setContentView(R.layout.player2);
  //              editText = (EditText) findViewById(R.id.editText);
                player1=color_1;
                break;
            case R.id.next2:
                setContentView(R.layout.start);
//                editText2 = (EditText) findViewById(R.id.editText2);
                player2=color_2;
                break;
            case R.id.back1:
                setContentView(R.layout.open_page);
                break;
            case R.id.back2:
                setContentView(R.layout.player1);
                break;
            case R.id.back3:
                setContentView(R.layout.player2);
                break;
        }
    }

}