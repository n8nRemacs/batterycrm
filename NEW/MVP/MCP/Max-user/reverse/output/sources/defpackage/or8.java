package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class or8 {
    public static zr8 d(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new zr8(obj);
    }

    public final Object a() {
        rq0 rq0Var = new rq0(1);
        e(rq0Var);
        return rq0Var.d();
    }

    public final Object c(Object obj) throws InterruptedException {
        Objects.requireNonNull(obj, "defaultValue is null");
        rq0 rq0Var = new rq0(1);
        e(rq0Var);
        if (rq0Var.getCount() != 0) {
            try {
                rq0Var.await();
            } catch (InterruptedException e) {
                rq0Var.d = true;
                py4 py4Var = rq0Var.c;
                if (py4Var != null) {
                    py4Var.dispose();
                }
                throw bj5.d(e);
            }
        }
        Throwable th = rq0Var.b;
        if (th != null) {
            throw bj5.d(th);
        }
        Object obj2 = rq0Var.a;
        return obj2 != null ? obj2 : obj;
    }

    public final void e(bs8 bs8Var) {
        try {
            f(bs8Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void f(bs8 bs8Var);
}
