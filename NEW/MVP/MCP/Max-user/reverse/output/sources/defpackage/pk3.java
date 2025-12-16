package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pk3 extends AtomicReference implements rk3, py4, Runnable, v2f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public pk3(rk3 rk3Var, j0e j0eVar) {
        this.a = 0;
        this.b = rk3Var;
        this.c = j0eVar;
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        ((v2f) this.b).a(obj);
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        switch (this.a) {
            case 0:
                ty4.d(this, ((j0e) this.c).b(this));
                break;
            default:
                ((rk3) this.b).b();
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.h(this, py4Var)) {
                    ((rk3) this.b).c(this);
                    break;
                }
                break;
            case 1:
                ty4.h(this, py4Var);
                break;
            default:
                ty4.h(this, py4Var);
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            case 1:
                ty4.a(this);
                n42 n42Var = (n42) this.c;
                n42Var.getClass();
                ty4.a(n42Var);
                break;
            default:
                ty4.a(this);
                n42 n42Var2 = (n42) this.c;
                n42Var2.getClass();
                ty4.a(n42Var2);
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
                this.d = th;
                ty4.d(this, ((j0e) this.c).b(this));
                break;
            case 1:
                ((rk3) this.b).onError(th);
                break;
            default:
                ((v2f) this.b).onError(th);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rk3 rk3Var = (rk3) this.b;
                Throwable th = (Throwable) this.d;
                if (th == null) {
                    rk3Var.b();
                    break;
                } else {
                    this.d = null;
                    rk3Var.onError(th);
                    break;
                }
            case 1:
                ((hk3) this.d).f(this);
                break;
            default:
                ((e2f) this.d).k(this);
                break;
        }
    }

    public pk3(v2f v2fVar, e2f e2fVar) {
        this.a = 2;
        this.b = v2fVar;
        this.d = e2fVar;
        this.c = new n42(2);
    }

    public pk3(rk3 rk3Var, hk3 hk3Var) {
        this.a = 1;
        this.b = rk3Var;
        this.d = hk3Var;
        this.c = new n42(2);
    }
}
