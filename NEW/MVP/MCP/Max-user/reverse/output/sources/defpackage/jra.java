package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jra extends AtomicReference implements Runnable, py4, v2f {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Serializable o;

    public jra(v2f v2fVar, long j) {
        this.a = 1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = v2fVar;
        this.b = j;
        this.o = timeUnit;
        this.d = new AtomicReference();
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        py4 py4Var = (py4) get();
        ty4 ty4Var = ty4.a;
        if (py4Var == ty4Var || !compareAndSet(py4Var, ty4Var)) {
            return;
        }
        ty4.a((AtomicReference) this.d);
        ((v2f) this.c).a(obj);
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ty4.h(this, py4Var);
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                ty4.a((AtomicReference) this.d);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 0:
                return get() == ty4.a;
            default:
                return ty4.c((py4) get());
        }
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        py4 py4Var = (py4) get();
        ty4 ty4Var = ty4.a;
        if (py4Var == ty4Var || !compareAndSet(py4Var, ty4Var)) {
            t8j.a(th);
        } else {
            ty4.a((AtomicReference) this.d);
            ((v2f) this.c).onError(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((AtomicBoolean) this.o).compareAndSet(false, true)) {
                    kra kraVar = (kra) this.d;
                    long j = this.b;
                    Object obj = this.c;
                    if (j == kraVar.o) {
                        kraVar.a.f(obj);
                        ty4.a(this);
                        break;
                    }
                }
                break;
            default:
                if (ty4.a(this)) {
                    ((v2f) this.c).onError(new TimeoutException(bj5.c(this.b, (TimeUnit) this.o)));
                    break;
                }
                break;
        }
    }

    public jra(Object obj, long j, kra kraVar) {
        this.a = 0;
        this.o = new AtomicBoolean();
        this.c = obj;
        this.b = j;
        this.d = kraVar;
    }
}
