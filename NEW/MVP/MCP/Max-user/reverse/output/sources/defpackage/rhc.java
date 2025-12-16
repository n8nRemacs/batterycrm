package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class rhc {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public rhc(tw0 tw0Var, k18 k18Var) {
        this.b = d7j.a(((q2b) ((lzf) k18Var.getValue())).c());
        tw0Var.d(this);
    }

    public static final s5g a(rhc rhcVar, pzf pzfVar) {
        String str = pzfVar.d;
        String str2 = pzfVar.b;
        return (str == null || str.length() == 0) ? (qaj.c(str2) && fni.a(str2, "io.exception")) ? new n5g(mvd.F) : (!qaj.c(str2) || fni.a(str2, "io.exception")) ? new n5g(mvd.E) : new n5g(mvd.I) : new r5g(str);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new phc(this, rj0Var, null), 3);
    }

    @vnf
    public final void onEvent(hhc hhcVar) {
        svi.e(this.b, null, null, new qhc(this, hhcVar, null), 3);
    }
}
