package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends Activity {
    /** Called when the activity is first created. */
	Button menu;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        menu=(Button)findViewById(R.id.button1);
        menu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(HelpActivity.this,MainMenuActivity.class));
				HelpActivity.this.finish();
			}
		});
    }
}