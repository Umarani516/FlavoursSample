package ro.stemo.productflavorstutorial.app.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).
                setTitle(getString(R.string.dlg_title)).
                setMessage(getString(R.string.dlg_mesage)).
                setNeutralButton(getString(R.string.action_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
        dlg.show();
    }

}
