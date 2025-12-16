package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class csa extends xl0 implements vta {
    public volatile boolean X;
    public final vta a;
    public final tm6 c;
    public py4 o;
    public final wy b = new wy();
    public final zl3 d = new zl3();

    public csa(vta vtaVar, tm6 tm6Var) {
        this.a = vtaVar;
        this.c = tm6Var;
        lazySet(1);
    }

    @Override // defpackage.vta
    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.e(this.a);
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.o, py4Var)) {
            this.o = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.o1f
    public final void clear() {
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
            i2f i2fVar = new i2f(this);
            if (this.X || !this.d.a(i2fVar)) {
                return;
            }
            hk3Var.f(i2fVar);
        } catch (Throwable th) {
            raj.c(th);
            this.o.dispose();
            onError(th);
        }
    }

    @Override // defpackage.psc
    public final int h(int i) {
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.b.b(th)) {
            this.X = true;
            this.o.dispose();
            this.d.dispose();
            this.b.e(this.a);
        }
    }

    @Override // defpackage.o1f
    public final Object poll() {
        return null;
    }
}
