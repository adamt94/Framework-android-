package se2.saaf.framework.implementation;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

import se2.saaf.framework.GPS;

/**
 * Created by BEN on 17/12/2015.
 */
public class AndroidGPS implements GPS {
    private boolean GPS = false;
    private boolean Network = false;
    private LocationManager locationManager;
    private AndroidLocationListener locationListener;
    private Activity activity;

    public AndroidGPS(Activity activity) {
        // Acquire a reference to the system Location Manager
        locationManager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
    }

    private class AndroidLocationListener implements LocationListener
    {

        Location myLocation;
        @Override
        public void onLocationChanged(Location location) {
            myLocation = location;
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {}

        @Override
        public void onProviderEnabled(String provider) {}

        @Override
        public void onProviderDisabled(String provider) {}
    }

    @Override
    public Location getLocation() {

        if (GPS || Network)
        {
            return locationListener.myLocation;
        }
        return null;
    }

    @Override
    public void enableLocation() {

    }

    @Override
    public void disableLocation() {

    }


}
