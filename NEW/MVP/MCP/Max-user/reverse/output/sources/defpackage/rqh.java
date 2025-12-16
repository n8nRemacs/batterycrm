package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class rqh {
    public final k18 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public rqh(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.c = d7j.a(((q2b) ((lzf) k18Var2.getValue())).a());
        ((tw0) k18Var.getValue()).d(this);
    }

    public final void a(pqh pqhVar) {
        svi.e(this.c, null, null, new qqh(this, pqhVar, null), 3);
    }

    @vnf
    public final void onEvent(dw5 dw5Var) {
        throw null;
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        a(new oqh(rj0Var.a));
    }

    @vnf
    public final void onEvent(bw5 bw5Var) {
        a(new oqh(bw5Var.b));
    }

    @vnf
    public final void onEvent(zv5 zv5Var) {
        a(new mqh(zv5Var.b));
    }

    @vnf
    public final void onEvent(cw5 cw5Var) {
        a(new nqh(cw5Var.a));
    }
}
