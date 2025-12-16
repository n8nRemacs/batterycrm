package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class sge extends ghe {
    public final long t0;
    public final String u0;
    public final Object v0;

    public sge(rge rgeVar) {
        super(rgeVar);
        this.t0 = rgeVar.g;
        this.u0 = rgeVar.h;
        this.v0 = rgeVar.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ghe, defpackage.hge
    public final void u() {
        si9 si9VarM;
        jm9 jm9Var;
        pb2 pb2VarM = b().M(this.c);
        if (pb2VarM == null || (si9VarM = l().m(this.t0)) == null || (jm9Var = si9VarM.t0) == jm9.DELETED) {
            return;
        }
        l().t(si9VarM, xi9.d);
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((w85) igeVar.q.getValue()).a(this.t0, this.c, this.u0, this.v0, jm9.EDITED, null, false);
        a().x(this.c, this.t0, pb2VarM.b.a, si9VarM.b, this.u0, si9VarM.Y, jm9Var, si9VarM.t() ? (List) si9VarM.x0.b : null, false, si9VarM.N0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.ghe
    public final ri9 v() {
        ri9 ri9Var = new ri9();
        String str = this.u0;
        if (!l8g.c(str)) {
            ri9Var.g = str;
        }
        ?? r1 = this.v0;
        if (!r1.isEmpty()) {
            ri9Var.D = r1;
        }
        ri9Var.F = this.s0;
        return ri9Var;
    }
}
