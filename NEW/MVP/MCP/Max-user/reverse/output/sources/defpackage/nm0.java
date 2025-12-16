package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class nm0 extends snf {
    public static final mm0[] Y = new mm0[0];
    public static final mm0[] Z = new mm0[0];
    public long X;
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference o;

    public nm0(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(Y);
        this.a = new AtomicReference(obj);
        this.o = new AtomicReference();
    }

    public static nm0 t(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new nm0(obj);
    }

    @Override // defpackage.vta
    public final void b() {
        AtomicReference atomicReference;
        aj5 aj5Var = bj5.a;
        do {
            atomicReference = this.o;
            if (atomicReference.compareAndSet(null, aj5Var)) {
                Lock lock = this.d;
                lock.lock();
                this.X++;
                AtomicReference atomicReference2 = this.a;
                tma tmaVar = tma.a;
                atomicReference2.lazySet(tmaVar);
                lock.unlock();
                for (mm0 mm0Var : (mm0[]) this.b.getAndSet(Z)) {
                    mm0Var.a(this.X, tmaVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (this.o.get() != null) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        bj5.b(obj, "onNext called with a null value.");
        if (this.o.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.X++;
        this.a.lazySet(obj);
        lock.unlock();
        for (mm0 mm0Var : (mm0[]) this.b.get()) {
            mm0Var.a(this.X, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        lk6 lk6Var;
        mm0 mm0Var = new mm0(vtaVar, this);
        vtaVar.c(mm0Var);
        AtomicReference atomicReference = this.b;
        while (true) {
            mm0[] mm0VarArr = (mm0[]) atomicReference.get();
            if (mm0VarArr == Z) {
                Throwable th = (Throwable) this.o.get();
                if (th == bj5.a) {
                    vtaVar.b();
                    return;
                } else {
                    vtaVar.onError(th);
                    return;
                }
            }
            int length = mm0VarArr.length;
            mm0[] mm0VarArr2 = new mm0[length + 1];
            System.arraycopy(mm0VarArr, 0, mm0VarArr2, 0, length);
            mm0VarArr2[length] = mm0Var;
            while (!atomicReference.compareAndSet(mm0VarArr, mm0VarArr2)) {
                if (atomicReference.get() != mm0VarArr) {
                    break;
                }
            }
            if (mm0Var.Y) {
                v(mm0Var);
                return;
            }
            if (mm0Var.Y) {
                return;
            }
            synchronized (mm0Var) {
                try {
                    if (mm0Var.Y) {
                        return;
                    }
                    if (mm0Var.c) {
                        return;
                    }
                    nm0 nm0Var = mm0Var.b;
                    Lock lock = nm0Var.c;
                    lock.lock();
                    mm0Var.Z = nm0Var.X;
                    Object obj = nm0Var.a.get();
                    lock.unlock();
                    mm0Var.d = obj != null;
                    mm0Var.c = true;
                    if (obj == null || mm0Var.test(obj)) {
                        return;
                    }
                    while (!mm0Var.Y) {
                        synchronized (mm0Var) {
                            try {
                                lk6Var = mm0Var.o;
                                if (lk6Var == null) {
                                    mm0Var.d = false;
                                    return;
                                }
                                mm0Var.o = null;
                            } finally {
                            }
                        }
                        lk6Var.z(mm0Var);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        bj5.b(th, "onError called with a null Throwable.");
        do {
            atomicReference = this.o;
            if (atomicReference.compareAndSet(null, th)) {
                rma rmaVar = new rma(th);
                Lock lock = this.d;
                lock.lock();
                this.X++;
                this.a.lazySet(rmaVar);
                lock.unlock();
                for (mm0 mm0Var : (mm0[]) this.b.getAndSet(Z)) {
                    mm0Var.a(this.X, rmaVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
        t8j.a(th);
    }

    public final Object u() {
        Object obj = this.a.get();
        if (obj == tma.a || (obj instanceof rma)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(mm0 mm0Var) {
        mm0[] mm0VarArr;
        while (true) {
            AtomicReference atomicReference = this.b;
            mm0[] mm0VarArr2 = (mm0[]) atomicReference.get();
            int length = mm0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (mm0VarArr2[i] == mm0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                mm0VarArr = Y;
            } else {
                mm0[] mm0VarArr3 = new mm0[length - 1];
                System.arraycopy(mm0VarArr2, 0, mm0VarArr3, 0, i);
                System.arraycopy(mm0VarArr2, i + 1, mm0VarArr3, i, (length - i) - 1);
                mm0VarArr = mm0VarArr3;
            }
            while (!atomicReference.compareAndSet(mm0VarArr2, mm0VarArr)) {
                if (atomicReference.get() != mm0VarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
