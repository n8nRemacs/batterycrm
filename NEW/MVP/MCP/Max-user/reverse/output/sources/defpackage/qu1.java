package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qu1 extends AtomicReference implements rk3, py4, v2f, bs8, vta {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ qu1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                lazySet(ty4.a);
                try {
                    ((gu3) this.b).accept(obj);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                    return;
                }
            case 3:
                try {
                    m3f m3fVar = (m3f) ((t2h) this.c).apply(obj);
                    if (!e()) {
                        e2f e2fVar = (e2f) m3fVar;
                        e2fVar.k(new xo8(this, 23, (bs8) this.b));
                        break;
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    onError(th2);
                    return;
                }
                break;
            case 4:
                ((bs8) this.c).a(obj);
                break;
            case 5:
                ((bs8) this.b).a(obj);
                break;
            case 6:
            default:
                try {
                    Object objApply = ((tm6) this.c).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                    or8 or8Var = (or8) objApply;
                    if (!e()) {
                        or8Var.e(new ssb(this, 8, (bs8) this.b));
                        break;
                    }
                } catch (Throwable th3) {
                    raj.c(th3);
                    onError(th3);
                    return;
                }
                break;
            case 7:
                ((v2f) this.b).a(obj);
                break;
            case 8:
                v2f v2fVar = (v2f) this.b;
                try {
                    Object objApply2 = ((tm6) this.c).apply(obj);
                    Objects.requireNonNull(objApply2, "The single returned by the mapper is null");
                    m3f m3fVar2 = (m3f) objApply2;
                    if (!e()) {
                        ((e2f) m3fVar2).k(new xpb(this, 8, v2fVar));
                        break;
                    }
                } catch (Throwable th4) {
                    raj.c(th4);
                    v2fVar.onError(th4);
                }
                break;
            case 9:
                try {
                    Object objApply3 = ((tm6) this.c).apply(obj);
                    Objects.requireNonNull(objApply3, "The mapper returned a null CompletableSource");
                    hk3 hk3Var = (hk3) objApply3;
                    if (!e()) {
                        hk3Var.f(this);
                        break;
                    }
                } catch (Throwable th5) {
                    raj.c(th5);
                    onError(th5);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        switch (this.a) {
            case 0:
                try {
                    ((p6) this.c).run();
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                }
                lazySet(ty4.a);
                break;
            case 1:
                ((hk3) this.c).f(new xt4(this, 12, (rk3) this.b));
                break;
            case 2:
            default:
                ((rk3) this.b).b();
                break;
            case 3:
                ((bs8) this.b).b();
                break;
            case 4:
                ((bs8) this.c).b();
                break;
            case 5:
                py4 py4Var = (py4) get();
                if (py4Var != ty4.a && compareAndSet(py4Var, null)) {
                    ((yr8) this.c).e(new py0((bs8) this.b, 21, this));
                    break;
                }
                break;
            case 6:
                ((vta) this.b).b();
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                ty4.h(this, py4Var);
                break;
            case 1:
                if (ty4.h(this, py4Var)) {
                    ((rk3) this.b).c(this);
                    break;
                }
                break;
            case 2:
                ty4.h(this, py4Var);
                break;
            case 3:
                if (ty4.h(this, py4Var)) {
                    ((bs8) this.b).c(this);
                    break;
                }
                break;
            case 4:
                ty4.h(this, py4Var);
                break;
            case 5:
                if (ty4.h(this, py4Var)) {
                    ((bs8) this.b).c(this);
                    break;
                }
                break;
            case 6:
                ty4.h((AtomicReference) this.c, py4Var);
                break;
            case 7:
                if (ty4.i((py4) this.c, py4Var)) {
                    this.c = py4Var;
                    ((v2f) this.b).c(this);
                    break;
                }
                break;
            case 8:
                if (ty4.h(this, py4Var)) {
                    ((v2f) this.b).c(this);
                    break;
                }
                break;
            case 9:
                ty4.d(this, py4Var);
                break;
            default:
                if (ty4.h(this, py4Var)) {
                    ((bs8) this.b).c(this);
                    break;
                }
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
                break;
            case 2:
                ty4.a(this);
                break;
            case 3:
                ty4.a(this);
                break;
            case 4:
                ty4.a(this);
                n42 n42Var = (n42) this.b;
                n42Var.getClass();
                ty4.a(n42Var);
                break;
            case 5:
                ty4.a(this);
                break;
            case 6:
                ty4.a((AtomicReference) this.c);
                ty4.a(this);
                break;
            case 7:
                p6 p6Var = (p6) getAndSet(null);
                if (p6Var != null) {
                    try {
                        p6Var.run();
                    } catch (Throwable th) {
                        raj.c(th);
                        t8j.a(th);
                    }
                    ((py4) this.c).dispose();
                    break;
                }
                break;
            case 8:
                ty4.a(this);
                break;
            case 9:
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
            case 0:
                if (get() == ty4.a) {
                }
                break;
            case 2:
                if (get() == ty4.a) {
                }
                break;
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        ((vta) this.b).f(obj);
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    ((gu3) this.b).accept(th);
                } catch (Throwable th2) {
                    raj.c(th2);
                    t8j.a(th2);
                }
                lazySet(ty4.a);
                break;
            case 1:
                ((rk3) this.b).onError(th);
                break;
            case 2:
                lazySet(ty4.a);
                try {
                    ((gu3) this.c).accept(th);
                    break;
                } catch (Throwable th3) {
                    raj.c(th3);
                    t8j.a(new CompositeException(th, th3));
                    return;
                }
            case 3:
                ((bs8) this.b).onError(th);
                break;
            case 4:
                ((bs8) this.c).onError(th);
                break;
            case 5:
                ((bs8) this.b).onError(th);
                break;
            case 6:
                ((vta) this.b).onError(th);
                break;
            case 7:
                ((v2f) this.b).onError(th);
                break;
            case 8:
                ((v2f) this.b).onError(th);
                break;
            case 9:
                ((rk3) this.b).onError(th);
                break;
            default:
                ((bs8) this.b).onError(th);
                break;
        }
    }

    public qu1(vta vtaVar) {
        this.a = 6;
        this.b = vtaVar;
        this.c = new AtomicReference();
    }

    public qu1(v2f v2fVar, gk0 gk0Var) {
        this.a = 7;
        this.b = v2fVar;
        lazySet(gk0Var);
    }

    public qu1(bs8 bs8Var) {
        this.a = 4;
        this.c = bs8Var;
        this.b = new n42(2);
    }
}
