package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends Activity {
    /** Called when the activity is first created. */
	TextView text;
	Button play,menu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        text=(TextView)findViewById(R.id.textView2);
        int score=(GameActivity.chance)*10;
        text.setText(""+score);
       Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
     
       play=(Button)findViewById(R.id.button1);
       menu=(Button)findViewById(R.id.button3);
    play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ScoreActivity.this,GameActivity.class));
				ScoreActivity.this.finish();
				
			}
		});
    menu.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity(new Intent(ScoreActivity.this,MainMenuActivity.class));
			ScoreActivity.this.finish();
			
		}
	});
    }
}