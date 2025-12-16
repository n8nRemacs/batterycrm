package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class n04 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public n04(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public final void a(long j) {
        wy1.q(j, "remove, id = ", n04.class.getName());
        k18 k18Var = this.c;
        int i = ((h8c) k18Var.getValue()).c().a(j).b;
        h8c h8cVar = (h8c) k18Var.getValue();
        b8c b8cVar = new b8c(0, i);
        h8cVar.getClass();
        h8cVar.i(Collections.singletonMap(Long.valueOf(j), b8cVar));
        k18 k18Var2 = this.a;
        qv3 qv3Var = (qv3) k18Var2.getValue();
        qv3Var.getClass();
        qv3Var.c(j, new i00(yv3.b, 15, xv3.b));
        ((qv3) k18Var2.getValue()).q(j, true);
        hwa hwaVar = (hwa) this.d.getValue();
        hwa.r(hwaVar, new y04(3, hwaVar.t().a.k(), j, null, null, null, null));
        ((jzf) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        qv3 qv3Var2 = (qv3) k18Var2.getValue();
        qv3Var2.getClass();
        bwd.a(new nv3(0, j, 0L, qv3Var2), new df3(5), qv3Var2.l);
        ((tw0) this.e.getValue()).c(new t24(j));
    }
}
