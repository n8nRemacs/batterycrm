package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class su3 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public su3(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public final void a(long j) {
        wy1.q(j, "block, id = ", su3.class.getName());
        qv3 qv3Var = (qv3) this.a.getValue();
        qv3Var.getClass();
        qv3Var.c(j, new i62(14, xv3.a));
        hwa hwaVar = (hwa) this.d.getValue();
        hwa.r(hwaVar, new y04(1, hwaVar.t().a.k(), j, null, null, null, null));
        ((ve2) this.b.getValue()).t(j, of2.o);
        ((jzf) this.c.getValue()).f(Collections.singletonList(new Long(j)));
        ((tw0) this.e.getValue()).c(new t24(j));
    }
}
