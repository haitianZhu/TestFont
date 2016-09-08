package com.example.fonttest;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		
		private View rootView;
		private TextView textview1, textview2, textview3, textview4, textview5;
		private Button button;
		
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			rootView = inflater.inflate(R.layout.fragment_main, container, false);
			init();
			return rootView;
		}
		
		private void init(){
			textview1 = (TextView) rootView.findViewById(R.id.textview1);
			textview2 = (TextView) rootView.findViewById(R.id.textview2);
			textview3 = (TextView) rootView.findViewById(R.id.textview3);
			textview4 = (TextView) rootView.findViewById(R.id.textview4);
			textview5 = (TextView) rootView.findViewById(R.id.textview5);
			button = (Button) rootView.findViewById(R.id.button);
			
			button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Typeface typeface1 = Typeface.create("Arial", 0);
					textview1.setTypeface(typeface1);
					
					Typeface typeface2 = Typeface.create("Calibri", 0);
					textview2.setTypeface(typeface2);
					
					Typeface typeface3 = Typeface.create("Wingdings2", 0);
					textview3.setTypeface(typeface3);
					
					Typeface typeface4 = Typeface.create("SongTi", 0);
					textview4.setTypeface(typeface4);
					
					Typeface typeface5 = Typeface.create(Typeface.MONOSPACE, 0);
					textview5.setTypeface(typeface5);
				}
			});
		}
	}

}
