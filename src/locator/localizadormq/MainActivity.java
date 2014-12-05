package locator.localizadormq;


import android.os.Bundle;

import com.mapquest.android.maps.GeoPoint;
import com.mapquest.android.maps.MapActivity;
import com.mapquest.android.maps.MapView;

public class MainActivity extends MapActivity {

	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
	}*/
	@Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // set the zoom level, center point and enable the default zoom controls 
      MapView map = (MapView) findViewById(R.id.map);
      map.getController().setZoom(20);
      map.getController().setCenter(new GeoPoint(-30.068334,-51.120298));
      map.setBuiltInZoomControls(true);
    }

    // return false since no route is being displayed 
    @Override
    public boolean isRouteDisplayed() {
      return false;
    }
}
