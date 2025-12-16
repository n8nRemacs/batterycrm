package defpackage;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class gl5 {
    public final Context a;
    public final kwf b;
    public final eo4 c;
    public final k30 d;
    public crf e;
    public crf f;
    public final k30 g;
    public final Looper h;
    public final j20 i;
    public final int j;
    public final boolean k;
    public final j9e l;
    public final yn4 m;
    public final long n;
    public boolean o;

    public gl5(Context context, fde fdeVar) {
        eo4 eo4Var = new eo4(5, fdeVar);
        k30 k30Var = new k30(context, 4);
        k30 k30Var2 = new k30(context, 6);
        te4 te4Var = new te4(3);
        k30 k30Var3 = new k30(context, 8);
        this.a = context;
        this.c = eo4Var;
        this.d = k30Var;
        this.e = k30Var2;
        this.f = te4Var;
        this.g = k30Var3;
        int i = xxg.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.i = j20.Y;
        this.j = 1;
        this.k = true;
        this.l = j9e.c;
        this.m = new yn4(0, xxg.B(20L), xxg.B(500L));
        this.b = kwf.a;
        this.n = 2000L;
    }
}
