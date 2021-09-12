package com.example.saurabhapp.saurabh;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.open_page);
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

    public int a=0,score1=0,score2=0,m=0,g=100,gg=1;
    public int player1=Color.BLUE,player2=Color.YELLOW;

    public void check(View v) {
        Button[] b = new Button[101];
        Button but=new Button(this);
        int i,j,k;
        int red=Color.RED,blue=Color.BLUE,yellow=Color.YELLOW,green=Color.GREEN,white=Color.WHITE,black=Color.BLACK;
        TextView name_1,name_2;
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
        switch (v.getId()){
            case R.id.open:
                setContentView(R.layout.player1);
                break;
            case R.id.start:
                setContentView(R.layout.activity_main);
                name_1=(TextView) findViewById(R.id.view1);
                name_2=(TextView) findViewById(R.id.view2);
                name_1.setText(String.format(Locale.US, "Player1 - %d", score1));
                name_2.setText(String.format(Locale.US, "Player2 - %d", score2));
                show();
                break;
            case R.id.next1:
                setContentView(R.layout.player2);
                break;
            case R.id.next2:
                setContentView(R.layout.start);
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
            case R.id.button86:
                if((m!=0)&&(score1+score2<25)){
                    i=m;
                    Button tab=(Button) findViewById(R.id.button86);
                    ColorDrawable col = (ColorDrawable) tab.getBackground();
                    int undocol = col.getColor();
                    b[i].setBackgroundColor(undocol);
                    g = 1;
                    if (i < 31) {
                        j = 5 * (i / 6) + (i % 6);
                        if (i % 6 < 2) {
                            ColorDrawable color1 = (ColorDrawable) b[j+60].getBackground();
                            int col1 = color1.getColor();
                            if (col1 != Color.WHITE) {
                                b[j+60].setBackgroundColor(white);
                                b[j+60].setText("");
                                reduce();
                            }
                        }
                        else{
                            ColorDrawable color1 = (ColorDrawable) b[j+60].getBackground();
                            int col1 = color1.getColor();
                            if (col1 != Color.WHITE) {
                                b[j+60].setBackgroundColor(white);
                                b[j+60].setText("");
                                reduce();
                            }
                            ColorDrawable color2 = (ColorDrawable) b[j-1+60].getBackground();
                            int col2 = color2.getColor();
                            if (col2 != Color.WHITE) {
                                b[j-1+60].setBackgroundColor(white);
                                b[j-1+60].setText("");
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
                                b[i+60].setText("");
                                reduce();
                            }
                        }
                        else if(i>25){
                            ColorDrawable color1 = (ColorDrawable) b[i+60-5].getBackground();
                            int col1 = color1.getColor();
                            if (col1 != Color.WHITE) {
                                b[i+60-5].setBackgroundColor(white);
                                b[i+60-5].setText("");
                                reduce();
                            }
                        }
                        else{
                            ColorDrawable color1 = (ColorDrawable) b[i+60].getBackground();
                            int col1 = color1.getColor();
                            if (col1 != Color.WHITE) {
                                b[i+60].setBackgroundColor(white);
                                b[i+60].setText("");
                                reduce();
                            }
                            ColorDrawable color2 = (ColorDrawable) b[i+60-5].getBackground();
                            int col2 = color2.getColor();
                            if (col2 != Color.WHITE) {
                                b[i+60-5].setBackgroundColor(white);
                                b[i+60-5].setText("");
                                reduce();
                            }
                        }
                    }
                    if(gg == 1) {
                        a=a-g;
                        gg = 0;
                    }
                    show();
                }
                break;
            default:
                gg = 1;
                name_1=(TextView) findViewById(R.id.view1);
                name_2=(TextView) findViewById(R.id.view2);
                ColorDrawable colorDrawable = (ColorDrawable) v.getBackground();
                int bcol = colorDrawable.getColor();
                g = 1;
                if(bcol!=Color.BLACK){
                    v.setBackgroundColor(Color.BLACK);
                    but = (Button) findViewById(v.getId());
                    i = 1;
                    while(i < 61 && but != b[i]) {
                        ++i;
                    }
                    m=i;
                    if (i < 31) {
                        j = 5 * (i / 6) + (i % 6);
                        if (i % 6 == 1) {
                            change(b[i],b[i+1],b[j+30],b[j+35],b[j+60]);
                        }
                        else if (i % 6 == 0){
                            change(b[i-1],b[i],b[j+30],b[j+35],b[j+60]);
                        }
                        else{
                            change(b[i],b[i+1],b[j+30],b[j+35],b[j+60]);change(b[i-1],b[i],b[j+29],b[j+34],b[j-1+60]);
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
                            change(b[i+30],b[i+ 35], b[j], b[j + 1], b[i + 60]);
                        }
                        else if(i>25){
                            change(b[i+25],b[i+30],b[j-6],b[j-5],b[i-5+60]);
                        }
                        else{
                            change(b[i+30],b[i+35],b[j],b[j+1],b[i+60]);change(b[i+25],b[i+30],b[j-6],b[j-5],b[i-5+60]);
                        }
                    }
                    a=a+g;
                }
                name_1.setText(String.format(Locale.US, "Player1 - %d", score1));
                name_2.setText(String.format(Locale.US, "Player2 - %d", score2));
                show();
                if((score1+score2)==25){
                    name_2.setText(" ");
                    TextView c1=(TextView) findViewById(R.id.p1chance);
                    TextView c2=(TextView) findViewById(R.id.p2chance);
                    c1.setText(" ");
                    c2.setText(" ");
                    if(score1>score2){name_1.setText(String.format(Locale.US, "Player %d Wins !!!", 1));}
                    else{name_1.setText(String.format(Locale.US, "Player %d Wins !!!", 2));}
                }
                break;
        }
    }

    public void show(){
        TextView c1=(TextView) findViewById(R.id.p1chance);
        TextView c2=(TextView) findViewById(R.id.p2chance);
        c1.setTextColor(player1);
        c2.setTextColor(player2);
        if(a%2==0){
            c1.setText(">>");
            c2.setText(" ");
        }
        else{
            c2.setText(">>");
            c1.setText(" ");
        }
    }

    public void change(Button p,Button q,Button r,Button s,Button t){
        ColorDrawable pc = (ColorDrawable) p.getBackground();
        ColorDrawable qc = (ColorDrawable) q.getBackground();
        ColorDrawable rc = (ColorDrawable) r.getBackground();
        ColorDrawable sc = (ColorDrawable) s.getBackground();
        int pcc = pc.getColor();
        int qcc = qc.getColor();
        int rcc = rc.getColor();
        int scc = sc.getColor();
        if((pcc==Color.BLACK)&&(pcc==qcc)&&(qcc==rcc)&&(rcc==scc)){
            if(g==a){++a;}
            if(a%2==0){
                t.setBackgroundColor(player1);
                if((player1==Color.YELLOW)||(player1==Color.GREEN)){
                    t.setTextColor(Color.BLACK);
                }
                else {
                    t.setTextColor(Color.WHITE);
                }
                t.setText("1");
                score1++;
            }
            else{
                t.setBackgroundColor(player2);
                if((player2==Color.YELLOW)||(player2==Color.GREEN)){
                    t.setTextColor(Color.BLACK);
                }
                else {
                    t.setTextColor(Color.WHITE);
                }
                t.setText("2");
                score2++;
            }
            g=0;
        }
    }

    public void reduce(){
        if(a%2==0){
            score1--;
        }
        else {
            score2--;
        }
        g = 0;
    }

    public void color(View v) {
        RadioButton radio1, radio2, radio3, radio4, rad1, rad2, rad3, rad4;
        rad1 = (RadioButton) findViewById(R.id.rad1);
        rad2 = (RadioButton) findViewById(R.id.rad2);
        rad3 = (RadioButton) findViewById(R.id.rad3);
        rad4 = (RadioButton) findViewById(R.id.rad4);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
        switch (v.getId()){
            case R.id.radio1:player1=Color.BLUE;player2=Color.GREEN;radio1.setChecked(true);radio2.setChecked(false);radio3.setChecked(false);radio4.setChecked(false);
                break;
            case R.id.radio2:player1=Color.GREEN;player2=Color.RED;radio1.setChecked(false);radio2.setChecked(true);radio3.setChecked(false);radio4.setChecked(false);
                break;
            case R.id.radio3:player1=Color.RED;player2=Color.YELLOW;radio1.setChecked(false);radio2.setChecked(false);radio3.setChecked(true);radio4.setChecked(false);
                break;
            case R.id.radio4:player1=Color.YELLOW;player2=Color.BLUE;radio1.setChecked(false);radio2.setChecked(false);radio3.setChecked(false);radio4.setChecked(true);
                break;
            case R.id.rad1:if(player1!=Color.BLUE){player2=Color.BLUE;}else{player2=Color.GREEN;}rad1.setChecked(true);rad2.setChecked(false);rad3.setChecked(false);rad4.setChecked(false);
                break;
            case R.id.rad2:if(player1!=Color.GREEN){player2=Color.GREEN;}else{player2=Color.RED;}rad1.setChecked(false);rad2.setChecked(true);rad3.setChecked(false);rad4.setChecked(false);
                break;
            case R.id.rad3:if(player1!=Color.RED){player2=Color.RED;}else{player2=Color.YELLOW;}rad1.setChecked(false);rad2.setChecked(false);rad3.setChecked(true);rad4.setChecked(false);
                break;
            case R.id.rad4:if(player1!=Color.YELLOW){player2=Color.YELLOW;}else{player2=Color.BLUE;}rad1.setChecked(false);rad2.setChecked(false);rad3.setChecked(false);rad4.setChecked(true);
                break;
        }
    }

}

