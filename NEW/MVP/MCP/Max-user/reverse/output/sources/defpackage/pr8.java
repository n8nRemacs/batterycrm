package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pr8 extends AtomicReference implements bs8, py4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public Object d;

    public pr8(gu3 gu3Var, gu3 gu3Var2, p6 p6Var) {
        this.b = gu3Var;
        this.c = gu3Var2;
        this.d = p6Var;
    }

    @Override // defpackage.bs8
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lazySet(ty4.a);
                try {
                    ((gu3) this.b).accept(obj);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                }
            default:
                try {
                    Object objApply = ((tm6) this.c).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                    or8 or8Var = (or8) objApply;
                    if (!e()) {
                        or8Var.e(new a3b(24, this));
                        break;
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    ((bs8) this.b).onError(th2);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.bs8
    public final void b() {
        switch (this.a) {
            case 0:
                lazySet(ty4.a);
                try {
                    ((p6) this.d).run();
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    t8j.a(th);
                    return;
                }
            default:
                ((bs8) this.b).b();
                break;
        }
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                ty4.h(this, py4Var);
                break;
            default:
                if (ty4.i((py4) this.d, py4Var)) {
                    this.d = py4Var;
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
            default:
                ty4.a(this);
                ((py4) this.d).dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                lazySet(ty4.a);
                try {
                    ((gu3) this.c).accept(th);
                    break;
                } catch (Throwable th2) {
                    raj.c(th2);
                    t8j.a(new CompositeException(th, th2));
                    return;
                }
            default:
                ((bs8) this.b).onError(th);
                break;
        }
    }

    public pr8(bs8 bs8Var, tm6 tm6Var) {
        this.b = bs8Var;
        this.c = tm6Var;
    }
}
