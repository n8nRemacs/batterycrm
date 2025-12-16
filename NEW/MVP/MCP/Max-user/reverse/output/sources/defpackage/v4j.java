package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class v4j {
    public static final int a(int i) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i) != 0) ? i : i | 33554432;
    }

    public static final PendingIntent b(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, d(intent, a(134217728)));
    }

    public static final int c(int i, float f) {
        return Color.argb(kti.d(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int d(Intent intent, int i) {
        String str;
        return (Build.VERSION.SDK_INT < 34 || !(((str = intent.getPackage()) == null || str.length() == 0 || intent.getComponent() == null) && ((33554432 & i) != 0))) ? i : 16777216 | i;
    }
}
