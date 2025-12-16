package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class s0c {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf e;
    public volatile py4 f;

    public s0c(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, bwf bwfVar) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = bwfVar;
    }

    public final void a() {
        py4 py4Var;
        wqi.c("s0c", "schedulePing", new Object[0]);
        py4 py4Var2 = this.f;
        if (py4Var2 != null && !py4Var2.e() && (py4Var = this.f) != null) {
            py4Var.dispose();
        }
        this.f = ((j0e) this.e.getValue()).a().c(new awa(9, this), 29000L, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        wqi.c("s0c", "startInteractivePings", new Object[0]);
        if (((fxa) this.c.getValue()).b()) {
            ((hwa) this.a.getValue()).B(true);
        }
        a();
    }
}
