package com.example.mel.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.speech.tts.TextToSpeech;

import com.example.mel.myapplication.bluetoothchat.*;
import com.example.mel.myapplication.bluetoothchat.BluetoothActivity;

import java.util.Locale;



public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    TextToSpeech tts;
    RelativeLayout r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    Button Core,coreback,abcback,abc,backcolor,color,backfood,food,backplace,place,backfeel,feel,backdes,des,backact,act,backthing,thing,red,green,blue,ic,cake,candy,church,school,park,happy,sad,angry,smart,beautiful,friendly,run,sit,play,toys,books,clothes,i,you,iwant,dwant;
    Button speak,clear,is,are,am,a,b,c,one,two,three,chat;

    ScrollView s1;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        chat = (Button) findViewById(R.id.button16);
        is = (Button) findViewById(R.id.button17);
        are = (Button) findViewById(R.id.button18);
        am = (Button) findViewById(R.id.button19);
        a = (Button) findViewById(R.id.button20);
        b = (Button) findViewById(R.id.button21);
        c = (Button) findViewById(R.id.button22);
        one =  (Button) findViewById(R.id.button23);
        two = (Button) findViewById(R.id.button24);
        three = (Button) findViewById(R.id.button25);
        red = (Button) findViewById(R.id.button26);
        green = (Button) findViewById(R.id.button27);
        blue = (Button) findViewById(R.id.button28);
        ic = (Button) findViewById(R.id.button29);
        cake = (Button) findViewById(R.id.button30);
        candy = (Button) findViewById(R.id.button31);
        church = (Button) findViewById(R.id.button32);
        school = (Button) findViewById(R.id.button33);
        park = (Button) findViewById(R.id.button34);
        happy = (Button) findViewById(R.id.button35);
        sad = (Button) findViewById(R.id.button36);
        angry = (Button) findViewById(R.id.button37);
        smart = (Button) findViewById(R.id.button38);
        beautiful = (Button) findViewById(R.id.button39);
        friendly = (Button) findViewById(R.id.button40);
        run = (Button) findViewById(R.id.button41);
        sit = (Button) findViewById(R.id.button42);
        play = (Button) findViewById(R.id.button43);
        toys = (Button) findViewById(R.id.button44);
        books = (Button) findViewById(R.id.button45);
        clothes = (Button) findViewById(R.id.button46);
        clear = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.editText);
        tts = new TextToSpeech(this, this);
        speak = (Button) findViewById(R.id.button);
        r1 = (RelativeLayout) findViewById(R.id.relativeLayout1);
        r2 = (RelativeLayout) findViewById(R.id.Rel2);
        r3 = (RelativeLayout) findViewById(R.id.Rel3);
        r4 = (RelativeLayout) findViewById(R.id.Rel4);
        r5 = (RelativeLayout) findViewById(R.id.Rel5);
        r6 = (RelativeLayout) findViewById(R.id.Rel6);
        r7 = (RelativeLayout) findViewById(R.id.Rel7);
        r8 = (RelativeLayout) findViewById(R.id.Rel8);
        r9 = (RelativeLayout) findViewById(R.id.Rel9);
        r10 = (RelativeLayout) findViewById(R.id.Rel10);
        coreback = (Button) findViewById(R.id.back);
        abcback = (Button) findViewById(R.id.backabc);
        backcolor = (Button) findViewById(R.id.backcolor);
        backfood = (Button) findViewById(R.id.backfood);
        backplace = (Button) findViewById(R.id.backplace);
        backfeel = (Button) findViewById(R.id.backfeel);
        backdes = (Button) findViewById(R.id.backdes);
        backact = (Button) findViewById(R.id.backact);
        backthing = (Button) findViewById(R.id.backthing);
        Core = (Button) findViewById(R.id.button3);
        abc = (Button) findViewById(R.id.button4) ;
        iwant = (Button) findViewById(R.id.button5) ;
        dwant = (Button) findViewById(R.id.button6) ;
        color = (Button) findViewById(R.id.button7);
        you = (Button) findViewById(R.id.button8);
        i = (Button) findViewById(R.id.button9);
        food = (Button) findViewById(R.id.button10);
        place = (Button) findViewById(R.id.button11);
        feel = (Button) findViewById(R.id.button12);
        des = (Button) findViewById(R.id.button13);
        act = (Button) findViewById(R.id.button14);
        thing = (Button) findViewById(R.id.button15);
        r2.setVisibility(View.INVISIBLE);
        r3.setVisibility(View.INVISIBLE);
        r4.setVisibility(View.INVISIBLE);
        r5.setVisibility(View.INVISIBLE);
        r6.setVisibility(View.INVISIBLE);
        r7.setVisibility(View.INVISIBLE);
        r8.setVisibility(View.INVISIBLE);
        r9.setVisibility(View.INVISIBLE);
        r10.setVisibility(View.INVISIBLE);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,BluetoothActivity.class);
                startActivity(intent);
            }
        });

        iwant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " I WANT");
            }
        });

        dwant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " I DON'T WANT");
            }
        });

        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " YOU");
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " I");
            }
        });

        toys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " TOYS");
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " BOOKS");
            }
        });

        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " CLOTHES");
            }
        });

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " RUN");
            }
        });

        sit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " SIT");
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " PLAY");
            }
        });

        smart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " SMART");
            }
        });

        beautiful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " BEAUTIFUL");
            }
        });

        friendly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " FRIENDLY");
            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " HAPPY");
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " SAD");
            }
        });

        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " ANGRY");
            }
        });

        church.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " CHURCH");
            }
        });

        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " SCHOOL");
            }
        });

        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " PARK");
            }
        });

        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " ICE CREAM");
            }
        });

        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " CAKE");
            }
        });

        candy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " CANDY");
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " RED");
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " GREEN");
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " BLUE");
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " A");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " B");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " C");
            }
        });

        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " IS");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " 1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " 2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " 3");
            }
        });

        are.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " ARE");
            }

        });
        am.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                e1.setText(e1.getText() + " AM");
            }

        });

        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                e1.setText("");
            }

        });

        speak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                speakOut();
            }

        });

        Core.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r2.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        coreback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r2.setVisibility(View.INVISIBLE);

            }
        });
        abc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r3.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        abcback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r3.setVisibility(View.INVISIBLE);

            }
        });
        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r4.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backcolor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r4.setVisibility(View.INVISIBLE);

            }
        });
        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r5.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backfood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r5.setVisibility(View.INVISIBLE);

            }
        });
        place.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r6.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backplace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r6.setVisibility(View.INVISIBLE);

            }
        });
        feel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r7.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backfeel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r7.setVisibility(View.INVISIBLE);

            }
        });
        des.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r8.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backdes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r8.setVisibility(View.INVISIBLE);

            }
        });
        act.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r9.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r9.setVisibility(View.INVISIBLE);

            }
        });
        thing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r10.setVisibility(View.VISIBLE);
                r1.setVisibility(View.INVISIBLE);

            }
        });
        backthing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r1.setVisibility(View.VISIBLE);
                r10.setVisibility(View.INVISIBLE);

            }
        });


    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                speak.setEnabled(true);
                speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    private void speakOut() {

        String text = e1.getText().toString();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }


}
