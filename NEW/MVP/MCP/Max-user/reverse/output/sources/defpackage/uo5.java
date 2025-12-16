package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class uo5 {
    public final tw0 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;
    public final Long d;

    public uo5(lzf lzfVar, tw0 tw0Var, long j, uf2 uf2Var, k18 k18Var) {
        int i;
        hbd hbdVarJ;
        this.a = tw0Var;
        this.c = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
        int iOrdinal = uf2Var.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        w63 w63Var = (w63) k18Var.getValue();
        w63Var.getClass();
        int iV = az1.v(i);
        if (iV == 0) {
            hbdVarJ = w63Var.j(j);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            hbdVarJ = w63Var.k(j);
        }
        pb2 pb2Var = (pb2) hbdVarJ.a.getValue();
        this.d = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
    }

    @vnf
    public final void onEvent(vkd vkdVar) {
        long j = vkdVar.b;
        Long l = this.d;
        if (l != null && j == l.longValue()) {
            svi.e(this.c, null, null, new to5(this, null), 3);
        }
    }
}
