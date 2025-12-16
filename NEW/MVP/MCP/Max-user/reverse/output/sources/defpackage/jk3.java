package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jk3 extends AtomicReference implements py4, vta, rk3 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jk3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(Throwable th) {
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
            ((rk3) this.b).onError(th);
        } finally {
            if (py4Var != null) {
                py4Var.dispose();
            }
        }
    }

    @Override // defpackage.vta
    public final void b() {
        py4 py4Var;
        switch (this.a) {
            case 0:
                Object obj = get();
                ty4 ty4Var = ty4.a;
                if (obj == ty4Var || (py4Var = (py4) getAndSet(ty4Var)) == ty4Var) {
                    return;
                }
                try {
                    ((rk3) this.b).b();
                    if (py4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (py4Var != null) {
                        py4Var.dispose();
                    }
                }
            case 1:
                ((LinkedBlockingQueue) this.b).offer(tma.a);
                return;
            default:
                dsa dsaVar = (dsa) this.b;
                dsaVar.d.c(this);
                dsaVar.b();
                return;
        }
    }

    @Override // defpackage.vta
    public void c(py4 py4Var) {
        switch (this.a) {
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
                if (ty4.a(this)) {
                    ((LinkedBlockingQueue) this.b).offer(c);
                    break;
                }
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 1:
                if (get() == ty4.a) {
                }
                break;
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        ((LinkedBlockingQueue) this.b).offer(obj);
    }

    @Override // defpackage.vta
    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                ((LinkedBlockingQueue) this.b).offer(new rma(th));
                break;
            default:
                dsa dsaVar = (dsa) this.b;
                dsaVar.d.c(this);
                dsaVar.onError(th);
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return jk3.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public jk3(dsa dsaVar) {
        this.a = 2;
        this.b = dsaVar;
    }
}
