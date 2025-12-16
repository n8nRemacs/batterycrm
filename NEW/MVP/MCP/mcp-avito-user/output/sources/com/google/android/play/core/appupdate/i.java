package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.install.InstallState;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class i extends com.google.android.play.core.appupdate.internal.r {
    @Override // com.google.android.play.core.appupdate.internal.r
    public final void a(Context context, Intent intent) {
        boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
        com.google.android.play.core.appupdate.internal.s sVar = this.f358040a;
        if (!zEquals) {
            sVar.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        sVar.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            sVar.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState installStateF = InstallState.f(intent, sVar);
        sVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateF);
        synchronized (this) {
            Iterator it = new HashSet(this.f358043d).iterator();
            while (it.hasNext()) {
                ((MY0.a) it.next()).a(installStateF);
            }
        }
    }
}
