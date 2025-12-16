package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dsa extends AtomicInteger implements py4, vta {
    public volatile boolean X;
    public final rk3 a;
    public final tm6 c;
    public py4 o;
    public final wy b = new wy();
    public final zl3 d = new zl3();

    public dsa(rk3 rk3Var, tm6 tm6Var) {
        this.a = rk3Var;
        this.c = tm6Var;
        lazySet(1);
    }

    @Override // defpackage.vta
    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.o, py4Var)) {
            this.o = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.X = true;
        this.o.dispose();
        this.d.dispose();
        this.b.c();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.o.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        try {
            Object objApply = this.c.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            hk3 hk3Var = (hk3) objApply;
            getAndIncrement();
            jk3 jk3Var = new jk3(this);
            if (this.X || !this.d.a(jk3Var)) {
                return;
            }
            hk3Var.f(jk3Var);
        } catch (Throwable th) {
            raj.c(th);
            this.o.dispose();
            onError(th);
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.b.b(th)) {
            this.X = true;
            this.o.dispose();
            this.d.dispose();
            this.b.d(this.a);
        }
    }
}
