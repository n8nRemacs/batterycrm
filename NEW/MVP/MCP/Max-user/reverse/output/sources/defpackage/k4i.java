package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class k4i extends Binder {
    public final usd c;

    public k4i(usd usdVar) {
        this.c = usdVar;
    }

    public final void a(l4i l4iVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = l4iVar.a;
        gg5 gg5Var = (gg5) this.c.b;
        n2g n2gVar = new n2g();
        gg5Var.a.execute(new se5(gg5Var, intent, n2gVar, 4));
        n2gVar.a.b(new es(2), new ehg(20, l4iVar));
    }
}
