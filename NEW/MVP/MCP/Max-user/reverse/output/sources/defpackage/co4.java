package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class co4 implements b29 {
    public static final int f = y3d.default_notification_channel_name;
    public final Context a;
    public final int b;
    public final NotificationManager c;
    public vd d;
    public final int e;

    public co4(rs0 rs0Var) {
        Context context = (Context) rs0Var.d;
        int i = rs0Var.b;
        this.a = context;
        this.b = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        hsi.h(notificationManager);
        this.c = notificationManager;
        this.e = ixc.media3_notification_small_icon;
    }
}
