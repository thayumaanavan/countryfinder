package vikky.CountryfinderGame;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {
    /** Called when the activity is first created. */
	Button submit;
	EditText character;
	String[] names;
	char[] str;
	 String s;
	TextView text,life;
	int n;
	static int chance;
	int count;
	 
	int win(char[] s ,int len)
     {
  	   for(int i=0;i<len;i++)
  	   {
  		   if(s[i]=='*')
  			   return 0;
  	   }  
  	   return 1;
     }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Resources res=getResources();
        names=res.getStringArray(R.array.country);
        submit=(Button)findViewById(R.id.button1);
        character=(EditText)findViewById(R.id.editText1);
        text=(TextView)findViewById(R.id.textView2);
        life=(TextView)findViewById(R.id.textView4);
        chance=9;
        Random rand = new Random();
        n = rand.nextInt(5)+1;
        text.clearComposingText();
        str=new char[names[n].length()];
        for(int i=0;i<names[n].length();i++)
        {
        	str[i]='*';
        }
        s=new String(str);
        text.setText(s);
        life.setText(""+chance);
        
        
        submit.setOnClickListener(new View.OnClickListener() {
       
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			
			    char ch=(char)character.getText().charAt(0);
			    character.setText("");	
				count=0;
				
				for(int i=0;i<names[n].length();i++)
				{
					
					if(names[n].charAt(i)==ch)
					{
						str[i]=ch;	
						s=new String(str);
				        text.setText(s);
				        count=1;
					}
					
				}
				if(count==0)
					{
						chance=chance-1;
						Toast.makeText(getApplicationContext(), "Wrong",Toast.LENGTH_SHORT).show();
						
						life.clearComposingText();
						life.setText(""+chance);
						
					}
				if(chance==0)
					{
					
						startActivity(new Intent(GameActivity.this,GameOverActivity.class));
						//GameActivity.this.finish();
					}
			if(win(str,names[n].length())==1)
					{
						startActivity(new Intent(GameActivity.this,ScoreActivity.class));
						GameActivity.this.finish();
					}
					
				
			
				
			}
			
		});
        
          
        
    }
}