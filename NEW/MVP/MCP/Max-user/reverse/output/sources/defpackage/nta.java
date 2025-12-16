package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nta extends AtomicReference implements vta, py4, Runnable {
    public volatile boolean X;
    public final yee a;
    public final long b;
    public final TimeUnit c;
    public final h0e d;
    public py4 o;

    public nta(yee yeeVar, long j, h0e h0eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = yeeVar;
        this.b = j;
        this.c = timeUnit;
        this.d = h0eVar;
    }

    @Override // defpackage.vta
    public final void b() {
        this.a.b();
        this.d.dispose();
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
        this.o.dispose();
        this.d.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        this.X = true;
        this.a.f(obj);
        py4 py4Var = (py4) get();
        if (py4Var != null) {
            py4Var.dispose();
        }
        ty4.d(this, this.d.c(this, this.b, this.c));
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        this.a.onError(th);
        this.d.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X = false;
    }
}
