package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ehe extends ghe {
    public final String t0;
    public final List u0;
    public List v0;
    public final boolean w0;

    public ehe(dhe dheVar) {
        super(dheVar);
        this.t0 = dheVar.h;
        this.u0 = dheVar.i;
        this.v0 = dheVar.g;
        this.w0 = dheVar.j;
    }

    @Override // defpackage.ghe
    public ri9 v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.v0.size());
        Iterator it = this.v0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d3 d3Var = (d3) it.next();
            if (d3Var instanceof h00) {
                arrayList2.add(d3Var);
                arrayList.add(((h00) d3Var).c);
            } else {
                ige igeVar = this.a;
                jmb jmbVarB = ((dac) (igeVar != null ? igeVar : null).A.getValue()).b(d3Var, this.w0);
                if (jmbVarB != null) {
                    d3 d3Var2 = (d3) jmbVarB.a;
                    w10 w10Var = (w10) jmbVarB.b;
                    if (d3Var2 != null && w10Var != null) {
                        arrayList2.add(d3Var2);
                        arrayList.add(w10Var);
                    }
                }
            }
        }
        String str = this.t0;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.v0 = arrayList2;
        x10 x10Var = new x10();
        x10Var.a = arrayList;
        jdc jdcVarC = x10Var.c();
        ri9 ri9Var = new ri9();
        ri9Var.n = jdcVarC;
        if (!l8g.c(str)) {
            ri9Var.g = str;
        }
        List list = this.u0;
        if (list != null && !list.isEmpty()) {
            ri9Var.D = list;
        }
        return ri9Var;
    }

    @Override // defpackage.ghe
    public long w(pb2 pb2Var, long j) throws Throwable {
        long j2;
        int i;
        long jW = super.w(pb2Var, j);
        si9 si9VarM = m().m(j);
        if (si9VarM == null) {
            return 0L;
        }
        int size = this.v0.size();
        int i2 = 0;
        while (i2 < size) {
            d3 d3Var = (d3) this.v0.get(i2);
            String str = si9VarM.x0.o(i2).r;
            if (d3Var instanceof vo5) {
                vo5 vo5Var = (vo5) d3Var;
                j2 = jW;
                i = i2;
                s().c(new xo5(n().a.k(), vo5Var.b, str, j, pb2Var.a, vo5Var.X));
            } else {
                j2 = jW;
                i = i2;
                if (!(d3Var instanceof h00)) {
                    long j3 = pb2Var.a;
                    ige igeVar = this.a;
                    if (igeVar == null) {
                        igeVar = null;
                    }
                    ((lv5) igeVar.b.getValue()).c(d3Var, j, j3, str);
                }
            }
            i2 = i + 1;
            jW = j2;
        }
        return jW;
    }
}
