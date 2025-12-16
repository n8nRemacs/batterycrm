package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.G;
import androidx.work.impl.Y;
import java.util.Objects;

/* loaded from: classes10.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        G.b("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        G gA2 = G.a();
        Objects.toString(intent);
        gA2.getClass();
        try {
            Y yF2 = Y.f(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            yF2.getClass();
            synchronized (Y.f55556o) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = yF2.f55565j;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    yF2.f55565j = pendingResultGoAsync;
                    if (yF2.f55564i) {
                        pendingResultGoAsync.finish();
                        yF2.f55565j = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException unused) {
            G.a().getClass();
        }
    }
}
