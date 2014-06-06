package ro.stemo.productflavorstutorial.app.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import ro.stemo.productflavorstutorial.app.R;
import ro.stemo.productflavorstutorial.app.preferences.SettingsActivity;


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}
