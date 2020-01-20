package com.noob.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

    }

    public void rotate(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(600);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new BounceInterpolator());

        tv.startAnimation(rotateAnimation);
    }

    public void translate(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0,0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(600);

        tv.startAnimation(translateAnimation);
    }

    public void alpha(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);
        alphaAnimation.setDuration(600);

        tv.startAnimation(alphaAnimation);
    }

    public void scale(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1.5f, 0, 1.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setFillAfter(true);

        tv.startAnimation(scaleAnimation);
    }
}
