package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lve extends o4 {
    public long a;
    public l42 b;

    @Override // defpackage.o4
    public final boolean a(n4 n4Var) {
        jve jveVar = (jve) n4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = jveVar.s0;
        if (j < jveVar.t0) {
            jveVar.t0 = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.o4
    public final Continuation[] b(n4 n4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((jve) n4Var).y(j);
    }
}
