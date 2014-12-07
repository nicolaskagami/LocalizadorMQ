package locator.localizadormq;


import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.mapquest.android.maps.GeoPoint;

public class EnrichedMap extends BasicMap {

	private float rotation = 0f;
	private static Context mContext;
	   
    @Override
    protected void init() 
    {
        setupMapView(new GeoPoint(-30.068334,-51.120298), 18);
        
        RelativeLayout container = (RelativeLayout)findViewById(R.id.container);
        
        Button button = new Button(this);
        button.setText("RotateMap");
        button.setOnClickListener(
        		new View.OnClickListener() 
        		{			
        			@Override
        			public void onClick(View v) 
        			{
        				rotation = rotation + 45.f;
						map.getController().setMapRotation(rotation);
        			}
        		}
        );
        container.addView(button);
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(
        		new View.OnClickListener() 
        		{
        				public void onClick(View v) 
        				{
        					Toast.makeText(getApplicationContext(), "Button Pressed!", Toast.LENGTH_SHORT).show();
        				}
        		}
        );
      
        mContext = getApplicationContext();
        Room.init();
        /*Room bigRoom = new Room("Sala1",Room.predio1Lat,Room.predio1Lng,this.map);
        Room bigRoom2 = new Room("Sala2",Room.predio1Lat+Room.salaTopStepLat,Room.predio1Lng+Room.salaTopStepLng,this.map);
        Room bigRoom3 = new Room("Sala2",Room.predio1Lat+Room.salaTopStepLat+Room.salaSideStepLat,Room.predio1Lng+Room.salaTopStepLng+Room.salaSideStepLng,this.map);
        Room bigRoom4 = new Room("Sala2",Room.predio1Lat+Room.salaSideStepLat,Room.predio1Lng+Room.salaSideStepLng,this.map);
        */
        
        Room roomArray[] = new Room[14] ;
        for(int i=0;i<7;i++)
        {
        	roomArray[i*2] = new Room("SalaEsperta",0,0,i,this.map);
        	roomArray[i*2+1] = new Room("SalaEsperta",0,1,i,this.map);
        }
        
    }

	    public static Context getContext() {
	        return mContext;
	    }
}
