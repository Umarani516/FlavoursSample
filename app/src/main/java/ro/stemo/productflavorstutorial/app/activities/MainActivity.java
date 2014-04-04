package ro.stemo.productflavorstutorial.app.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ro.stemo.productflavorstutorial.app.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
