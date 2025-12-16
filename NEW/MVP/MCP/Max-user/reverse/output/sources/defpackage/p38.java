package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class p38 implements f48 {
    public final hk4 a;
    public final j48 b;

    public p38(j48 j48Var, hk4 hk4Var) {
        this.b = j48Var;
        this.a = hk4Var;
    }

    @ova(k38.ON_DESTROY)
    public void onDestroy(j48 j48Var) {
        hk4 hk4Var = this.a;
        synchronized (hk4Var.a) {
            try {
                p38 p38VarF = hk4Var.f(j48Var);
                if (p38VarF == null) {
                    return;
                }
                hk4Var.m(j48Var);
                Iterator it = ((Set) ((HashMap) hk4Var.c).get(p38VarF)).iterator();
                while (it.hasNext()) {
                    ((HashMap) hk4Var.b).remove((oa0) it.next());
                }
                ((HashMap) hk4Var.c).remove(p38VarF);
                p38VarF.b.p().f(p38VarF);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ova(k38.ON_START)
    public void onStart(j48 j48Var) {
        this.a.l(j48Var);
    }

    @ova(k38.ON_STOP)
    public void onStop(j48 j48Var) {
        this.a.m(j48Var);
    }
}
