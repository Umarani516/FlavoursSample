package ro.stemo.productflavorstutorial.app.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import ro.stemo.productflavorstutorial.app.R;


public class MainActivity extends Activity {

    private int[] mColors;
    private int mSelectedColor = 0;
    private RelativeLayout mRootLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColors = new int[]{getResources().getColor(android.R.color.holo_blue_light),
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.holo_orange_light),
                getResources().getColor(android.R.color.holo_purple),
                getResources().getColor(android.R.color.holo_red_light)};

        mRootLayout = (RelativeLayout) findViewById(R.id.root);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor();
            }
        });
    }

    private void changeColor() {
        if (mSelectedColor + 1 < mColors.length) {
            mSelectedColor++;
        } else {
            mSelectedColor = 0;
            mRootLayout.setBackgroundColor(mColors[0]);
        }

        mRootLayout.setBackgroundColor(mColors[mSelectedColor]);
        mRootLayout.refreshDrawableState();
    }


}
