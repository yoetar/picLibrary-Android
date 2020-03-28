package yoetar.picLibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import yoetar.library.viewPicture.KenBurnsView;
import yoetar.library.viewPicture.Transition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KenBurnsView kenBurnsView = findViewById(R.id.IdKenBurnsView);
        kenBurnsView.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {

            }
            @Override
            public void onTransitionEnd(Transition transition) {

            }
        });
    }
}