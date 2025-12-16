package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class uta extends AtomicBoolean implements vta, py4 {
    public final vta a;
    public final rj5 b;
    public py4 c;

    public uta(vta vtaVar, rj5 rj5Var) {
        this.a = vtaVar;
        this.b = rj5Var;
    }

    @Override // defpackage.vta
    public final void b() {
        if (get()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.c, py4Var)) {
            this.c = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.b(new r98(9, this));
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (get()) {
            return;
        }
        this.a.f(obj);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (get()) {
            t8j.a(th);
        } else {
            this.a.onError(th);
        }
    }
}
