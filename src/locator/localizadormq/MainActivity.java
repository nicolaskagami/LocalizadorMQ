package locator.localizadormq;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mapquest.android.maps.GeoPoint;
import com.mapquest.android.maps.MapActivity;
import com.mapquest.android.maps.MapView;

public class MainActivity extends MapActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // set the zoom level, center point and enable the default zoom controls 
      MapView map = (MapView) findViewById(R.id.map);
      map.getController().setZoom(24);
      map.getController().setCenter(new GeoPoint(-30.068334,-51.120298));
      map.setBuiltInZoomControls(true);
      
      
      final Intent intent = new Intent(this, EnrichedMap.class);
      
      final Button button = (Button) findViewById(R.id.button1);
      button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
        	  Toast.makeText(getApplicationContext(), "Button Pressed!", Toast.LENGTH_SHORT).show();
        	  startActivity(intent);
          }
      });
    }

    // return false since no route is being displayed 
    @Override
    public boolean isRouteDisplayed() {
      return false;
    }
    
    
    
    
}
