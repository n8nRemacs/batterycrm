package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class um3 extends h0e {
    public final q98 a;
    public final zl3 b;
    public final q98 c;
    public final wm3 d;
    public volatile boolean o;

    public um3(wm3 wm3Var) {
        this.d = wm3Var;
        q98 q98Var = new q98();
        this.a = q98Var;
        zl3 zl3Var = new zl3();
        this.b = zl3Var;
        q98 q98Var2 = new q98();
        this.c = q98Var2;
        q98Var2.a(q98Var);
        q98Var2.a(zl3Var);
    }

    @Override // defpackage.h0e
    public final py4 b(Runnable runnable) {
        return this.o ? cd5.a : this.d.f(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.o ? cd5.a : this.d.f(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.c.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.o;
    }
}
