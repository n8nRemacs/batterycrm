package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes.dex */
public final class rra implements vta, py4 {
    public boolean X;
    public final vta a;
    public final gu3 b;
    public final gu3 c;
    public final p6 d;
    public py4 o;

    public rra(vta vtaVar, gu3 gu3Var, gu3 gu3Var2, p6 p6Var) {
        this.a = vtaVar;
        this.b = gu3Var;
        this.c = gu3Var2;
        this.d = p6Var;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.X) {
            return;
        }
        try {
            this.d.run();
            this.X = true;
            this.a.b();
        } catch (Throwable th) {
            raj.c(th);
            onError(th);
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
        this.o.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.o.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        try {
            this.b.accept(obj);
            this.a.f(obj);
        } catch (Throwable th) {
            raj.c(th);
            this.o.dispose();
            onError(th);
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.X) {
            t8j.a(th);
            return;
        }
        this.X = true;
        try {
            this.c.accept(th);
        } catch (Throwable th2) {
            raj.c(th2);
            th = new CompositeException(th, th2);
        }
        this.a.onError(th);
    }
}
