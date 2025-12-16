package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wy extends AtomicReference {
    public final Throwable a() {
        aj5 aj5Var = bj5.a;
        Throwable th = (Throwable) get();
        aj5 aj5Var2 = bj5.a;
        return th != aj5Var2 ? (Throwable) getAndSet(aj5Var2) : th;
    }

    public final boolean b(Throwable th) {
        aj5 aj5Var = bj5.a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == bj5.a) {
                t8j.a(th);
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!compareAndSet(th2, compositeException)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public final void c() {
        Throwable thA = a();
        if (thA == null || thA == bj5.a) {
            return;
        }
        t8j.a(thA);
    }

    public final void d(rk3 rk3Var) {
        Throwable thA = a();
        if (thA == null) {
            rk3Var.b();
        } else if (thA != bj5.a) {
            rk3Var.onError(thA);
        }
    }

    public final void e(vta vtaVar) {
        Throwable thA = a();
        if (thA == null) {
            vtaVar.b();
        } else if (thA != bj5.a) {
            vtaVar.onError(thA);
        }
    }

    public final void f(aof aofVar) {
        Throwable thA = a();
        if (thA == null) {
            aofVar.b();
        } else if (thA != bj5.a) {
            aofVar.onError(thA);
        }
    }
}
