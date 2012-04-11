package vikky.CountryfinderGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ImageView i=(ImageView)findViewById(R.id.imageView1);
        i.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(SplashActivity.this,MainMenuActivity.class));
		        SplashActivity.this.finish();
			}
		});
        
    }
}