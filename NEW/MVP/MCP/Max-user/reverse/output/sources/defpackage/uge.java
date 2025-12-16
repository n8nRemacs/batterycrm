package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class uge extends ghe {
    public final long t0;
    public final long u0;
    public final long v0;

    public uge(tge tgeVar) {
        super(tgeVar);
        this.t0 = tgeVar.g;
        this.u0 = tgeVar.h;
        this.v0 = tgeVar.i;
    }

    @Override // defpackage.ghe
    public final ri9 v() throws Throwable {
        r10 r10Var;
        si9 si9VarM = m().m(this.u0);
        if (e().M(this.t0) != null && si9VarM != null) {
            jdc jdcVar = si9VarM.x0;
            int iP = jdcVar.p();
            for (int i = 0; i < iP; i++) {
                w10 w10VarO = jdcVar.o(i);
                if (w10VarO == null) {
                    break;
                }
                k10 k10Var = w10VarO.b;
                boolean zF = w10VarO.f();
                long j = this.v0;
                if ((zF && k10Var.Z == j) || ((w10VarO.h() && w10VarO.d.a == j) || (((r10Var = w10VarO.f) != null && r10Var.a == j) || (w10VarO.g() && w10VarO.g.a == j)))) {
                    if (w10VarO.f()) {
                        k10 k10Var2 = new k10(k10Var.b());
                        x00 x00VarI = w10VarO.i();
                        x00VarI.b = k10Var2;
                        w10VarO = x00VarI.a();
                    }
                    x10 x10Var = new x10();
                    x10Var.a = Collections.singletonList(w10VarO);
                    jdc jdcVarC = x10Var.c();
                    String str = w10VarO.g() ? w10VarO.g.b : null;
                    ri9 ri9Var = new ri9();
                    ri9Var.g = str;
                    ri9Var.n = jdcVarC;
                    return ri9Var;
                }
            }
        }
        return null;
    }
}
