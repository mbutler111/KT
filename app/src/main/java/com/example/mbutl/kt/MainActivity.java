package com.example.mbutl.kt;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int total = 12;
    int current = 0;
    String names[] = new String[total];
    String pics[] = new String[total];


    public void nextSlide(View view){
        TextView msg = (TextView) findViewById(R.id.message);

        if(current == names.length - 1)
            current = 0;
        else
            ++current;

        setMsg();
        setPic();
    }

    public void prevSlide(View view){
        TextView msg = (TextView) findViewById(R.id.message);

        if(current == 0)
            current = names.length - 1;
        else
            --current;

        setMsg();
        setPic();
    }

    //onCreate methods below

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setStrings();
        setMsg();
        setPic();
    }

    public void setStrings(){
        names[0] = "Here is us on one of our first adventures. I hope there are many more.";
        names[1] = "Remember how incredible the lights were on the falls?";
        names[2] = "And remember how soaked we got while we were on the boat?";
        names[3] = "This was one of the most perfect views I had ever seen and I'm glad I got to experience it with you.";
        names[4] = "A picture from the mill lights. There is no one I'd rather spend Christmas with than you.";
        names[5] = "The bridge we crossed to get to the Mill. I hope we go back next year.";
        names[6] = "This trip was so fun. Still one of my favorite memories.";
        names[7] = "Our favorite spot in the state park.";
        names[8] = "You and your shenanigans";
        names[9] = "The art museum turned out to be a great experience.";
        names[10] = "I can not be more glad that you talked me into doing something that was so fun.";
        names[11] = "I'm glad I got to show you your first rock concert. Next time we'll take ear plugs :)";

        ////////////////////

        pics[0] = "falls";
        pics[1] = "color";
        pics[2] = "boat";
        pics[3] = "view";
        pics[4] = "mill";
        pics[5] = "bridge";
        pics[6] = "lights";
        pics[7] = "vista";
        pics[8] = "sleep";
        pics[9] = "painting";
        pics[10] = "statue";
        pics[11] = "rock";
    }

    public void setMsg(){
        TextView msg = (TextView) findViewById(R.id.message);
        msg.setText(names[current]);
    }

    public void setPic(){
        ImageView pic = (ImageView) findViewById(R.id.pic);

        int id = getResources().getIdentifier(pics[current], "drawable", getPackageName());
        Drawable drawable1 = getResources().getDrawable(id);
        pic.setImageDrawable(drawable1);
    }
}
