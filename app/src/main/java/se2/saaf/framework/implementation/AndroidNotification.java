package se2.saaf.framework.implementation;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v4.app.NotificationCompat.Builder;

import se2.saaf.R;
import se2.saaf.framework.Image;
import se2.saaf.framework.Notification;

/**
 * Created by BEN on 17/12/2015.
 */
public class AndroidNotification implements Notification {

    private Builder builder;
    private NotificationManager manager;
    private Context context;
    private int id;
    private String contentTitle;
    private String contentText;
    private Image icon;

    public AndroidNotification(Context context) {
        this.context = context;
        manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Override
    public void createNotification(int id, String title, String content) {
        builder = new Builder(context).setSmallIcon(0);
        builder.setSmallIcon(android.support.v7.appcompat.R.drawable.notification_template_icon_bg);
        builder.setContentTitle(title);
        builder.setContentText(content);
        Intent rIntent = new Intent();
        manager.notify(id,builder.build());
    }

    @Override
    public void updateNotification(int id, String title, String content){

    }

    @Override
    public void cancelNotificaiton(int id) {

    }

    @Override
    public void cancelAll() {

    }
}
