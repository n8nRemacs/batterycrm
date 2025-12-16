package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pta extends AtomicInteger implements vta, py4, Runnable {
    public py4 X;
    public volatile boolean Y;
    public Throwable Z;
    public final vta a;
    public final long b;
    public final TimeUnit c;
    public final h0e d;
    public final AtomicReference o;
    public volatile boolean s0;
    public volatile boolean t0;
    public boolean u0;

    public pta(vta vtaVar, h0e h0eVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = vtaVar;
        this.b = 3L;
        this.c = timeUnit;
        this.d = h0eVar;
        this.o = new AtomicReference();
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.o;
        vta vtaVar = this.a;
        int iAddAndGet = 1;
        while (!this.s0) {
            boolean z = this.Y;
            Throwable th = this.Z;
            if (z && th != null) {
                atomicReference.lazySet(null);
                vtaVar.onError(th);
                this.d.dispose();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                if (!z2) {
                    atomicReference.getAndSet(null);
                }
                vtaVar.b();
                this.d.dispose();
                return;
            }
            if (z2) {
                if (this.t0) {
                    this.u0 = false;
                    this.t0 = false;
                }
            } else if (!this.u0 || this.t0) {
                vtaVar.f(atomicReference.getAndSet(null));
                this.t0 = false;
                this.u0 = true;
                this.d.c(this, this.b, this.c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.o.lazySet(null);
    }

    @Override // defpackage.vta
    public final void b() {
        this.Y = true;
        a();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.X, py4Var)) {
            this.X = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.s0 = true;
        this.X.dispose();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            this.o.lazySet(null);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.s0;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        this.o.getAndSet(obj);
        a();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        this.Z = th;
        this.Y = true;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t0 = true;
        a();
    }
}
