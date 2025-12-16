package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class ema {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }
}
