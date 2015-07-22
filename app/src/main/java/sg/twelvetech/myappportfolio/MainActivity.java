package sg.twelvetech.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public void launchApp(View view)
    {
        // create a toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        if (toast != null)
            toast.cancel();

        switch (view.getId())
        {
            case R.id.spotify:
                toast = Toast.makeText(context, getString(R.string.spotify_streamer_msg), duration);
                toast.show();
                break;
            case R.id.scores:
                toast = Toast.makeText(context, getString(R.string.scores_msg), duration);
                toast.show();
                break;
            case R.id.library:
                toast = Toast.makeText(context, getString(R.string.library_msg), duration);
                toast.show();
                break;
            case R.id.bigger:
                toast = Toast.makeText(context, getString(R.string.bigger_msg), duration);
                toast.show();
                break;
            case R.id.reader:
                toast = Toast.makeText(context, getString(R.string.xyz_reader_msg), duration);
                toast.show();
                break;
            case R.id.capstone:
                toast = Toast.makeText(context, getString(R.string.capstone_msg), duration);
                toast.show();
                break;
            default:
                break;
        }
    }
}
