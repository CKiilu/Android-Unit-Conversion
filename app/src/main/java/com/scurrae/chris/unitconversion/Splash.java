package com.scurrae.chris.unitconversion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by chris on 3/2/16.
 */
public class Splash extends Activity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
//
//        final ImageView iv = (ImageView) findViewById(R.id.imageView);
//        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
//        iv.startAnimation(an);
//        an.setAnimationListener(new Animation.AnimationListener(){
//            @Override
//            public void onAnimationStart(Animation animation){
//
//            }
//            @Override
//            public void onAnimationEnd(Animation animation){
//                finish();
//                Intent i = new Intent(getBaseContext(), Main.class);
//                startActivity(i);
//
//            }
//            @Override
//            public void onAnimationRepeat(Animation animation){
//
//            }
//
//        });
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, Main.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
