package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pj9 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public pj9(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public static eh9 a(pj9 pj9Var, si9 si9Var) {
        pj9Var.getClass();
        si9 si9Var2 = si9Var.A0;
        sk9 sk9Var = si9Var2 != null ? new sk9(si9Var.y0, si9Var.z0, a(pj9Var, si9Var2), si9Var.B0, si9Var.C0, si9Var.D0, si9Var.S0, si9Var.H0, si9Var.I0) : null;
        si9 si9Var3 = si9Var.J0;
        eh9 eh9VarA = si9Var3 != null ? a(pj9Var, si9Var3) : null;
        c7c c7cVar = (c7c) pj9Var.b.getValue();
        return new eh9(si9Var, ((qv3) pj9Var.a.getValue()).i(si9Var.o, true), sk9Var, eh9VarA, (d7c) c7cVar.c.computeIfAbsent(Long.valueOf(si9Var.a), new ni(23, new a7c(c7cVar, 0, si9Var))), (hl9) pj9Var.c.getValue(), (mm9) pj9Var.d.getValue(), (ij2) pj9Var.e.getValue());
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (si9) it.next()));
        }
        return arrayList2;
    }
}
