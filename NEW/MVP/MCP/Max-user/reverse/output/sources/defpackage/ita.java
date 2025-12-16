package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ita extends AtomicReference implements vta, py4, Runnable {
    public py4 X;
    public final yee a;
    public final long b;
    public final TimeUnit c;
    public final j0e d;
    public final AtomicReference o = new AtomicReference();

    public ita(yee yeeVar, long j, TimeUnit timeUnit, j0e j0eVar) {
        this.a = yeeVar;
        this.b = j;
        this.c = timeUnit;
        this.d = j0eVar;
    }

    @Override // defpackage.vta
    public final void b() {
        ty4.a(this.o);
        this.a.b();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.X, py4Var)) {
            this.X = py4Var;
            this.a.c(this);
            long j = this.b;
            ty4.d(this.o, this.d.d(this, j, j, this.c));
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        ty4.a(this.o);
        this.X.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.X.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        getAndSet(obj);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        ty4.a(this.o);
        this.a.onError(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.a.f(andSet);
        }
    }
}
