package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class ou3 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public ou3(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
    }

    public final void a(long j) {
        wy1.q(j, "add, id = ", ou3.class.getName());
        qv3 qv3Var = (qv3) this.a.getValue();
        qv3Var.getClass();
        qv3Var.c(j, new i00(yv3.a, 15, null));
        hwa hwaVar = (hwa) this.c.getValue();
        hwa.r(hwaVar, new y04(4, hwaVar.t().a.k(), j, null, null, null, null));
        ((jzf) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        ((tw0) this.d.getValue()).c(new t24(j));
    }
}
