package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class t4i implements Runnable {
    public static final String Y = cei.m("WorkForegroundRunnable");
    public final t2g X;
    public final ike a = new ike();
    public final Context b;
    public final r5i c;
    public final ma8 d;
    public final u4i o;

    public t4i(Context context, r5i r5iVar, ma8 ma8Var, u4i u4iVar, u5i u5iVar) {
        this.b = context;
        this.c = r5iVar;
        this.d = ma8Var;
        this.o = u4iVar;
        this.X = u5iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.i(null);
            return;
        }
        ike ikeVar = new ike();
        u5i u5iVar = (u5i) this.X;
        ((i30) u5iVar.c).execute(new n1h(this, 13, ikeVar));
        ikeVar.d(new c5e(this, ikeVar, false, 7), (i30) u5iVar.c);
    }
}
