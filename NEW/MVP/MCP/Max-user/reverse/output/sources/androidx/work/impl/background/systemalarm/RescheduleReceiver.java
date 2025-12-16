package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.c5i;
import defpackage.cei;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = cei.m("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cei.g().c(a, "Received intent " + intent);
        try {
            c5i c5iVarD = c5i.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c5iVarD.getClass();
            synchronized (c5i.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c5iVarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c5iVarD.i = pendingResultGoAsync;
                    if (c5iVarD.h) {
                        pendingResultGoAsync.finish();
                        c5iVarD.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            cei.g().f(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
