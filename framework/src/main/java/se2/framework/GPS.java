package se2.framework;

/**
 * Created by BEN on 17/12/2015.
 */
public interface GPS {

    public void onLocationChange();

    public Location getLocation();

    public double getLongitude();

    public double getLatitude();
}
