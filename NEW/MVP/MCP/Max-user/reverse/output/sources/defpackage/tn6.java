package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class tn6 extends CountDownLatch implements bs8, v2f, rk3, Future, py4 {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public tn6() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // defpackage.bs8
    public final void a(Object obj) {
        AtomicReference atomicReference = this.c;
        py4 py4Var = (py4) atomicReference.get();
        if (py4Var == ty4.a) {
            return;
        }
        this.a = obj;
        while (!atomicReference.compareAndSet(py4Var, this) && atomicReference.get() == py4Var) {
        }
        countDown();
    }

    @Override // defpackage.bs8
    public final void b() {
        AtomicReference atomicReference = this.c;
        py4 py4Var = (py4) atomicReference.get();
        if (py4Var == ty4.a) {
            return;
        }
        while (!atomicReference.compareAndSet(py4Var, this) && atomicReference.get() == py4Var) {
        }
        countDown();
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        ty4.h(this.c, py4Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ty4 ty4Var;
        while (true) {
            AtomicReference atomicReference = this.c;
            py4 py4Var = (py4) atomicReference.get();
            if (py4Var == this || py4Var == (ty4Var = ty4.a)) {
                return false;
            }
            while (!atomicReference.compareAndSet(py4Var, ty4Var)) {
                if (atomicReference.get() != py4Var) {
                    break;
                }
            }
            if (py4Var != null) {
                py4Var.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
    }

    @Override // defpackage.py4
    public final boolean e() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ty4.c((py4) this.c.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        while (true) {
            AtomicReference atomicReference = this.c;
            py4 py4Var = (py4) atomicReference.get();
            if (py4Var == ty4.a) {
                t8j.a(th);
                return;
            }
            this.b = th;
            while (!atomicReference.compareAndSet(py4Var, this)) {
                if (atomicReference.get() != py4Var) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(bj5.c(j, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
