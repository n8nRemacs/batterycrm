package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.J;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import androidx.work.impl.workers.DiagnosticsWorker;
import j.N;
import j.P;
import java.util.Collections;

@RestrictTo
/* loaded from: classes10.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        G.b("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@N Context context, @P Intent intent) {
        if (intent == null) {
            return;
        }
        G.a().getClass();
        try {
            WorkManager.f55428a.getClass();
            Y yF2 = Y.f(context);
            J.f55385e.getClass();
            yF2.e(Collections.singletonList(new J.a(DiagnosticsWorker.class).b()));
        } catch (IllegalStateException unused) {
            G.a().getClass();
        }
    }
}
