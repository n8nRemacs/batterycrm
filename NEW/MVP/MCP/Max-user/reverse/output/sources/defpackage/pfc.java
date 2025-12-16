package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class pfc {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public pfc(tw0 tw0Var, k18 k18Var) {
        this.b = d7j.a(((q2b) ((lzf) k18Var.getValue())).c());
        tw0Var.d(this);
    }

    public static final s5g a(pfc pfcVar, pzf pzfVar) {
        String str = pzfVar.d;
        String str2 = pzfVar.b;
        return (str == null || str.length() == 0) ? (qaj.c(str2) && fni.a(str2, "io.exception")) ? new n5g(mvd.F) : (!qaj.c(str2) || fni.a(str2, "io.exception")) ? new n5g(mvd.E) : new n5g(mvd.I) : new r5g(str);
    }

    @vnf
    public final void onEvent(lhc lhcVar) {
        svi.e(this.b, null, null, new kfc(this, lhcVar, null), 3);
    }

    @vnf
    public final void onEvent(dbc dbcVar) {
        svi.e(this.b, null, null, new lfc(this, dbcVar, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new mfc(this, rj0Var, null), 3);
    }

    @vnf
    public final void onEvent(hhc hhcVar) {
        svi.e(this.b, null, null, new nfc(this, hhcVar, null), 3);
    }

    @vnf
    public final void onEvent(a03 a03Var) {
        svi.e(this.b, null, null, new ofc(this, a03Var, null), 3);
    }
}
