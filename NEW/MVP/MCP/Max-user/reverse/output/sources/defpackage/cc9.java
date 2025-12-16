package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class cc9 extends j8a {
    public final rwd l = new rwd();

    @Override // defpackage.cb8
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            nwd nwdVar = (nwd) it;
            if (!nwdVar.hasNext()) {
                return;
            } else {
                ((bc9) ((Map.Entry) nwdVar.next()).getValue()).b();
            }
        }
    }

    @Override // defpackage.cb8
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            nwd nwdVar = (nwd) it;
            if (!nwdVar.hasNext()) {
                return;
            }
            bc9 bc9Var = (bc9) ((Map.Entry) nwdVar.next()).getValue();
            bc9Var.a.j(bc9Var);
        }
    }

    public void l(cb8 cb8Var, wta wtaVar) {
        if (cb8Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        bc9 bc9Var = new bc9(cb8Var, wtaVar);
        bc9 bc9Var2 = (bc9) this.l.b(cb8Var, bc9Var);
        if (bc9Var2 != null && bc9Var2.b != wtaVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (bc9Var2 == null && this.c > 0) {
            bc9Var.b();
        }
    }
}
