package defpackage;

import android.net.Uri;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class ys4 implements tn5 {
    public final Object a;
    public final Object b;
    public volatile Object c;
    public Object d;
    public final Object o;

    public ys4(y6d y6dVar) {
        this.a = y6dVar;
        this.b = new CopyOnWriteArrayList();
        this.d = new os8(1, new ps8(0.0d, 0.0d), null, true);
        this.o = new xs4(this);
    }

    public void a(ns8 ns8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        if (copyOnWriteArrayList.contains(ns8Var)) {
            return;
        }
        copyOnWriteArrayList.add(ns8Var);
        ns8Var.n((os8) this.d);
    }

    public void b(ns8 ns8Var) {
        ((CopyOnWriteArrayList) this.b).remove(ns8Var);
    }

    public void c(z3e z3eVar) {
        this.c = z3eVar;
        qk3 qk3VarH = new kk3(2, new u64(this, new un5(this, 0, z3eVar))).h(u0e.b());
        n42 n42Var = new n42(1);
        qk3VarH.f(n42Var);
        ((zl3) this.d).a(n42Var);
    }

    @Override // defpackage.tn5
    public z3e f() {
        String str;
        z3e z3eVarC = (z3e) this.c;
        if (z3eVarC == null) {
            qm sessionInfo = ((rm) this.a).getSessionInfo();
            z3e z3eVar = z3e.c;
            ((ll) this.b).getClass();
            z3e z3eVarB = z3eVar.b("CGPGAGLGDIHBABABA");
            if ((sessionInfo != null ? sessionInfo.c : null) != null) {
                z3eVarB = z3eVarB.d(Uri.parse(sessionInfo.c));
            }
            z3eVarC = ((sessionInfo != null ? sessionInfo.a : null) == null || (str = sessionInfo.b) == null) ? z3eVarB : z3eVarB.c(sessionInfo.a, str);
        }
        this.c = z3eVarC;
        return z3eVarC;
    }

    public ys4(rm rmVar, ll llVar) {
        this.a = rmVar;
        this.b = llVar;
        this.d = new zl3();
        this.o = new ReentrantLock();
    }
}
