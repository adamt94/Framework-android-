package se2.framework;

/**
 * Created by BEN on 17/12/2015.
 */
public class Location {
    private double latitude;
    private double longitude;
    private String title;
    private String description;

    public Location(double lat, double lon, String name, String desc){
        latitude = lat;
        longitude = lon;
        title = name;
        description = desc;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
