package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tk3 implements rk3, py4, bs8, vta, v2f {
    public final /* synthetic */ int a;
    public py4 b;
    public final Object c;
    public Object d;

    public /* synthetic */ tk3(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.bs8
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                bs8 bs8Var = (bs8) this.c;
                try {
                    Object objApply = ((tm6) this.d).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper returned a null item");
                    bs8Var.a(objApply);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    bs8Var.onError(th);
                    return;
                }
            case 2:
                py4 py4Var = this.b;
                ty4 ty4Var = ty4.a;
                if (py4Var != ty4Var) {
                    try {
                        ((fs8) this.d).b.accept(obj);
                        this.b = ty4Var;
                        ((bs8) this.c).a(obj);
                        break;
                    } catch (Throwable th2) {
                        raj.c(th2);
                        d(th2);
                        return;
                    }
                }
                break;
            case 3:
                this.b = ty4.a;
                ((v2f) this.c).a(obj);
                break;
            case 4:
            case 5:
            default:
                ((v2f) this.c).a(obj);
                try {
                    ((gk0) this.d).run();
                    break;
                } catch (Throwable th3) {
                    raj.c(th3);
                    t8j.a(th3);
                }
            case 6:
                ((v2f) this.c).a(obj);
                try {
                    ((sm8) this.d).accept(obj);
                    break;
                } catch (Throwable th4) {
                    raj.c(th4);
                    t8j.a(th4);
                    return;
                }
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        switch (this.a) {
            case 0:
                rk3 rk3Var = (rk3) this.c;
                uk3 uk3Var = (uk3) this.d;
                if (this.b != ty4.a) {
                    try {
                        uk3Var.c.run();
                        rk3Var.b();
                        break;
                    } catch (Throwable th) {
                        raj.c(th);
                        rk3Var.onError(th);
                        return;
                    }
                }
                break;
            case 1:
                ((bs8) this.c).b();
                break;
            case 2:
                py4 py4Var = this.b;
                ty4 ty4Var = ty4.a;
                if (py4Var != ty4Var) {
                    try {
                        ((fs8) this.d).d.run();
                        this.b = ty4Var;
                        ((bs8) this.c).b();
                        break;
                    } catch (Throwable th2) {
                        raj.c(th2);
                        d(th2);
                        return;
                    }
                }
                break;
            case 3:
                v2f v2fVar = (v2f) this.c;
                this.b = ty4.a;
                v2fVar.a((pcd) this.d);
                break;
            case 4:
                Collection collection = (Collection) this.d;
                this.d = null;
                vta vtaVar = (vta) this.c;
                vtaVar.f(collection);
                vtaVar.b();
                break;
            default:
                Collection collection2 = (Collection) this.d;
                this.d = null;
                ((v2f) this.c).a(collection2);
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                rk3 rk3Var = (rk3) this.c;
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    rk3Var.c(this);
                    break;
                }
                break;
            case 1:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((bs8) this.c).c(this);
                    break;
                }
                break;
            case 2:
                bs8 bs8Var = (bs8) this.c;
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    bs8Var.c(this);
                    break;
                }
                break;
            case 3:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((v2f) this.c).c(this);
                    break;
                }
                break;
            case 4:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((vta) this.c).c(this);
                    break;
                }
                break;
            case 5:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((v2f) this.c).c(this);
                    break;
                }
                break;
            case 6:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((v2f) this.c).c(this);
                    break;
                }
                break;
            default:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((v2f) this.c).c(this);
                    break;
                }
                break;
        }
    }

    public void d(Throwable th) {
        try {
            ((fs8) this.d).c.accept(th);
        } catch (Throwable th2) {
            raj.c(th2);
            th = new CompositeException(th, th2);
        }
        this.b = ty4.a;
        ((bs8) this.c).onError(th);
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            case 1:
                py4 py4Var = this.b;
                this.b = ty4.a;
                py4Var.dispose();
                break;
            case 2:
                this.b.dispose();
                this.b = ty4.a;
                break;
            case 3:
                this.b.dispose();
                this.b = ty4.a;
                break;
            case 4:
                this.b.dispose();
                break;
            case 5:
                this.b.dispose();
                break;
            case 6:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        switch (this.a) {
            case 4:
                ((Collection) this.d).add(obj);
                break;
            default:
                ((Collection) this.d).add(obj);
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                uk3 uk3Var = (uk3) this.d;
                if (this.b != ty4.a) {
                    try {
                        uk3Var.b.accept(th);
                    } catch (Throwable th2) {
                        raj.c(th2);
                        th = new CompositeException(th, th2);
                    }
                    ((rk3) this.c).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            case 1:
                ((bs8) this.c).onError(th);
                break;
            case 2:
                if (this.b != ty4.a) {
                    d(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            case 3:
                this.b = ty4.a;
                ((v2f) this.c).onError(th);
                break;
            case 4:
                this.d = null;
                ((vta) this.c).onError(th);
                break;
            case 5:
                this.d = null;
                ((v2f) this.c).onError(th);
                break;
            case 6:
                ((v2f) this.c).onError(th);
                break;
            default:
                ((v2f) this.c).onError(th);
                try {
                    ((gk0) this.d).run();
                    break;
                } catch (Throwable th3) {
                    raj.c(th3);
                    t8j.a(th3);
                }
        }
    }

    public tk3(uk3 uk3Var, rk3 rk3Var) {
        this.a = 0;
        this.d = uk3Var;
        this.c = rk3Var;
    }
}
