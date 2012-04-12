package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import vikky.CountryfinderGame.GameActivity;

public class GameOverActivity extends Activity {
    /** Called when the activity is first created. */
	Button play,menu;
	TextView result;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        result=(TextView)findViewById(R.id.res);
		result.setText("The Answer is "+GameActivity.names[GameActivity.n]);
        
        
        play=(Button)findViewById(R.id.button1);
        menu=(Button)findViewById(R.id.button3);
     play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(GameOverActivity.this,GameActivity.class));
				GameOverActivity.this.finish();
				
			}
		});
     menu.setOnClickListener(new View.OnClickListener() {
 		
 		@Override
 		public void onClick(View arg0) {
 			// TODO Auto-generated method stub
 			startActivity(new Intent(GameOverActivity.this,MainMenuActivity.class));
 			GameOverActivity.this.finish();
 			
 		}
 	});
        
    }
}