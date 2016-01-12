package se2.saaf.framework;

import se2.saaf.framework.implementation.Database;

/**
 * Created by BEN on 17/12/2015.
 */
public interface App {

    public Audio getAudio();

    public Database getDatabase();

    public FileIO getFileIO();

    public GPS getGPS();

    public Graphics getGraphics();

    public Input getInput();

    public Notification getNotification();
}
