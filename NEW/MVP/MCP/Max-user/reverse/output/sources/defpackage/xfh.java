package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public abstract class xfh {
    public final ContextScope a;

    public xfh() {
        arf arfVarA = zk6.a();
        ep4 ep4Var = gy4.a;
        this.a = d7j.a(arfVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
    }

    public static x9f o(xfh xfhVar, x74 x74Var, sm6 sm6Var, int i) {
        if ((i & 1) != 0) {
            x74Var = bd5.a;
        }
        return svi.d(xfhVar.a, x74Var, (i & 2) != 0 ? i84.a : i84.b, sm6Var);
    }

    public static void r(ci5 ci5Var, Object obj) {
        ci5Var.b.h(obj);
    }

    public void s() {
    }
}
