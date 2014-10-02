package app.com.example.hong.namethatofficial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] electedPositions = {"Governor", "Lieutenant Governor", "Secretary of State", "Attorney General", "State Senator 1", "State Senator 2"};
        final String[] electedOfficials = {"Rick Snyder -R", "Brian Calley -R", "Ruth Johnson -R", "Bill Schuette -R", "Deborah Stabenow -D", "Carl Levin -D"};

        ListAdapter positionListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, electedPositions);

        ListView positionView = (ListView) findViewById(R.id.mainView);

        positionView.setAdapter(positionListAdapter);

        positionView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String positionSelected = String.valueOf(electedOfficials[position]);
                Toast.makeText(MainActivity.this, positionSelected, Toast.LENGTH_LONG).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
