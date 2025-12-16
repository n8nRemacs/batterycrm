package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qge extends ehe {
    public final long x0;

    public qge(pge pgeVar) {
        super(pgeVar);
        this.x0 = pgeVar.k;
    }

    @Override // defpackage.ghe, defpackage.hge
    public final void u() throws Throwable {
        jm9 jm9Var;
        pb2 pb2VarM = b().M(this.c);
        if (pb2VarM == null) {
            return;
        }
        qi9 qi9VarL = l();
        long j = this.x0;
        si9 si9VarM = qi9VarL.m(j);
        if (si9VarM == null || (jm9Var = si9VarM.t0) == jm9.DELETED) {
            return;
        }
        l().t(si9VarM, xi9.d);
        jdc jdcVar = v().n;
        List list = jdcVar != null ? (List) jdcVar.b : null;
        if (list == null) {
            list = hd5.a;
        }
        List list2 = list;
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((w85) igeVar.q.getValue()).a(this.x0, this.c, this.t0, this.u0, jm9.EDITED, list2, true);
        a().x(this.c, this.x0, pb2VarM.b.a, si9VarM.b, this.t0, si9VarM.Y, jm9Var, si9VarM.t() ? (List) si9VarM.x0.b : null, true, si9VarM.N0);
        si9 si9VarM2 = l().m(j);
        if (si9VarM2 != null) {
            int size = this.v0.size();
            for (int i = 0; i < size; i++) {
                if (!(this.v0.get(i) instanceof h00)) {
                    d3 d3Var = (d3) this.v0.get(i);
                    long j2 = pb2VarM.a;
                    String str = si9VarM2.x0.o(i).r;
                    ige igeVar2 = this.a;
                    if (igeVar2 == null) {
                        igeVar2 = null;
                    }
                    ((lv5) igeVar2.b.getValue()).c(d3Var, this.x0, j2, str);
                }
            }
        }
    }

    @Override // defpackage.ehe, defpackage.ghe
    public final ri9 v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.v0.size());
        for (d3 d3Var : this.v0) {
            ige igeVar = this.a;
            if (igeVar == null) {
                igeVar = null;
            }
            jmb jmbVarB = ((dac) igeVar.A.getValue()).b(d3Var, this.w0);
            if (jmbVarB != null) {
                d3 d3Var2 = (d3) jmbVarB.a;
                w10 w10Var = (w10) jmbVarB.b;
                if (d3Var2 != null && w10Var != null) {
                    arrayList2.add(d3Var2);
                    arrayList.add(w10Var);
                }
            }
        }
        this.v0 = arrayList2;
        x10 x10Var = new x10();
        x10Var.a = arrayList;
        jdc jdcVarC = x10Var.c();
        ri9 ri9Var = new ri9();
        ri9Var.n = jdcVarC;
        String str = this.t0;
        if (!l8g.c(str)) {
            ri9Var.g = str;
        }
        List list = this.u0;
        if (list != null && !list.isEmpty()) {
            ri9Var.D = list;
        }
        ri9Var.F = this.s0;
        return ri9Var;
    }
}
