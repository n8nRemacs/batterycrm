package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.c5i;
import defpackage.cei;
import defpackage.ngb;
import defpackage.ogb;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = cei.m("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        cei ceiVarG = cei.g();
        String str = a;
        ceiVarG.c(str, "Requesting diagnostics");
        try {
            c5i.d(context).a((ogb) new ngb(DiagnosticsWorker.class).build());
        } catch (IllegalStateException e) {
            cei.g().f(str, "WorkManager is not initialized", e);
        }
    }
}
