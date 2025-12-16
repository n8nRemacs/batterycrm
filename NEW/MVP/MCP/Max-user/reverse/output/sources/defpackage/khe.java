package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class khe extends ghe {
    public final String t0;
    public final w10 u0;
    public final boolean v0;

    public khe(jhe jheVar) {
        super(jheVar);
        this.t0 = jheVar.h;
        this.u0 = (w10) jheVar.j;
        this.v0 = jheVar.i;
    }

    @Override // defpackage.ghe
    public final ri9 v() {
        boolean z = this.v0;
        w10 w10VarA = this.u0;
        if (z) {
            x00 x00VarI = w10VarA.i();
            x00VarI.x = m10.b;
            w10VarA = x00VarI.a();
        }
        x10 x10Var = new x10();
        x10Var.a = Collections.singletonList(w10VarA);
        jdc jdcVarC = x10Var.c();
        ri9 ri9Var = new ri9();
        ri9Var.n = jdcVarC;
        String str = this.t0;
        if (!l8g.c(str)) {
            ri9Var.g = str;
        }
        ri9Var.D = null;
        return ri9Var;
    }

    @Override // defpackage.ghe
    public final long w(pb2 pb2Var, long j) {
        long jW = super.w(pb2Var, j);
        if (this.v0) {
            hwa hwaVarA = a();
            hwa.r(hwaVarA, new v5a(hwaVarA.t().a.k(), this.u0.g.b, j));
        }
        return jW;
    }
}
