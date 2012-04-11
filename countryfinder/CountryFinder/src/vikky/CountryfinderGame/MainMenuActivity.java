package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenuActivity extends Activity {
    /** Called when the activity is first created. */
	TextView play,help,score;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        play = (TextView) findViewById(R.id.TextView01);
        help = (TextView) findViewById(R.id.textView02);
        score = (TextView) findViewById(R.id.TextView03);
        
        play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainMenuActivity.this,GameActivity.class));
			      MainMenuActivity.this.finish();
				
			}
		});
        
        help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainMenuActivity.this,HelpActivity.class));
			      MainMenuActivity.this.finish();
				
			}
		});

		score.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		startActivity(new Intent(MainMenuActivity.this,ScoreActivity.class));
	      MainMenuActivity.this.finish();
		
	}
});
        
    }
    
    
       
        
   
}