package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class cs2 {
    public final bc2 a;
    public final hwa b;
    public String c = null;
    public int d = 0;
    public final ContextScope e;
    public final ArrayList f;
    public zr2 g;
    public boolean h;
    public long i;
    public long j;
    public int k;

    public cs2(bc2 bc2Var, hwa hwaVar) {
        this.a = bc2Var;
        this.b = hwaVar;
        arf arfVarA = zk6.a();
        ep4 ep4Var = gy4.a;
        this.e = d7j.a(arfVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
        this.f = new ArrayList();
        this.h = true;
    }

    public final void a() {
        this.i = 0L;
        this.k = 0;
        this.d = 0;
        this.f.clear();
        this.j = 0L;
        this.c = null;
        this.h = true;
    }
}
