package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOverActivity extends Activity {
    /** Called when the activity is first created. */
	Button play,quit;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        play=(Button)findViewById(R.id.button1);
        quit=(Button)findViewById(R.id.button2);
     play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(GameOverActivity.this,GameActivity.class));
				GameOverActivity.this.finish();
				
			}
		});
        quit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				GameOverActivity.this.finish();
				
			}
		});
        
        
    }
}