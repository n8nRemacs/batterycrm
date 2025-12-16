package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ohc {
    public final tw0 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public ohc(tw0 tw0Var, lzf lzfVar) {
        this.a = tw0Var;
        this.c = d7j.a(((q2b) lzfVar).c());
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        s5g n5gVar;
        Long lValueOf = Long.valueOf(rj0Var.a);
        pzf pzfVar = rj0Var.b;
        String str = pzfVar.d;
        String str2 = pzfVar.b;
        if (str == null || str.length() == 0) {
            n5gVar = (qaj.c(str2) && fni.a(str2, "io.exception")) ? new n5g(mvd.F) : (!qaj.c(str2) || fni.a(str2, "io.exception")) ? new n5g(mvd.E) : new n5g(mvd.I);
        } else {
            n5gVar = new r5g(str);
        }
        svi.e(this.c, null, null, new nhc(this, new jhc(lValueOf, n5gVar), null), 3);
    }

    @vnf
    public final void onEvent(a03 a03Var) {
        svi.e(this.c, null, null, new nhc(this, new khc(Long.valueOf(a03Var.a)), null), 3);
    }
}
