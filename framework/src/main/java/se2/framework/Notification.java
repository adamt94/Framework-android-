package se2.framework;

/**
 * Created by BEN on 17/12/2015.
 */
public interface Notification {

    public void setSmallIcon(Image icon);

    public void setContentTitle(String content);

    public void setContentText(String text);

    public Image setSmallIcon();

    public String setContentTitle();

    public String setContentText();

    public void cancel();

    public void cancelAll();

    public void setAutoCancel();
}
