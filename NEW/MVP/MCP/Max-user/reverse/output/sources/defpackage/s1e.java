package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class s1e extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public s1e(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                tih tihVar = (tih) it.next();
                tihVar.getClass();
                wqi.c("tih", "onScreenOff", new Object[0]);
                if (tihVar.l) {
                    tihVar.l = false;
                    if (tihVar.k) {
                        tihVar.a();
                    }
                }
            }
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                tih tihVar2 = (tih) it2.next();
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    tihVar2.getClass();
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "tih", "onScreenOn, isAppVisible=" + tihVar2.k + ", isScreenOn=" + tihVar2.l, null);
                    }
                }
                if (!tihVar2.l) {
                    tihVar2.l = true;
                    if (tihVar2.k) {
                        tihVar2.b();
                    }
                }
            }
        }
    }
}
