package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel;
import j.InterfaceC42160p;

/* compiled from: NotificationCompatSideChannelService.java */
/* loaded from: classes.dex */
public abstract class D extends Service {

    /* compiled from: NotificationCompatSideChannelService.java */
    public class a extends INotificationSideChannel.Stub {
        @Override // android.support.v4.app.INotificationSideChannel
        public final void cancel(String str, int i12, String str2) {
            Binder.getCallingUid();
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void cancelAll(String str) {
            Binder.getCallingUid();
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void notify(String str, int i12, String str2, Notification notification) {
            Binder.getCallingUid();
            throw null;
        }
    }

    @Override // android.app.Service
    @InterfaceC42160p
    public final IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
