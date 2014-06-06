package ro.stemo.productflavorstutorial.modules.somemodule.preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;

import ro.stemo.productflavorstutorial.modules.somemodule.R;

/**
 * Created by Stelian Morariu on 06/06/14.
 */
public class SomeModulePreferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        addPreferencesFromResource(R.xml.prefs);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
