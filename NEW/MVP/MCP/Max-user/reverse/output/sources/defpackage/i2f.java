package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i2f extends AtomicReference implements l2f, py4, rk3 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public i2f(v2f v2fVar) {
        this.b = v2fVar;
    }

    public void a(Object obj) {
        py4 py4Var;
        v2f v2fVar = (v2f) this.b;
        Object obj2 = get();
        ty4 ty4Var = ty4.a;
        if (obj2 == ty4Var || (py4Var = (py4) getAndSet(ty4Var)) == ty4Var) {
            return;
        }
        try {
            if (obj == null) {
                v2fVar.onError(bj5.a("onSuccess called with a null value."));
            } else {
                v2fVar.a(obj);
            }
            if (py4Var != null) {
                py4Var.dispose();
            }
        } catch (Throwable th) {
            if (py4Var != null) {
                py4Var.dispose();
            }
            throw th;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        csa csaVar = (csa) this.b;
        csaVar.d.c(this);
        csaVar.b();
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        ty4.h(this, py4Var);
    }

    public boolean d(Throwable th) {
        py4 py4Var;
        if (th == null) {
            th = bj5.a("onError called with a null Throwable.");
        }
        Object obj = get();
        ty4 ty4Var = ty4.a;
        if (obj == ty4Var || (py4Var = (py4) getAndSet(ty4Var)) == ty4Var) {
            return false;
        }
        try {
            ((v2f) this.b).onError(th);
        } finally {
            if (py4Var != null) {
                py4Var.dispose();
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!d(th)) {
                    t8j.a(th);
                    break;
                }
                break;
            default:
                csa csaVar = (csa) this.b;
                csaVar.d.c(this);
                csaVar.onError(th);
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return i2f.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public i2f(csa csaVar) {
        this.b = csaVar;
    }
}
