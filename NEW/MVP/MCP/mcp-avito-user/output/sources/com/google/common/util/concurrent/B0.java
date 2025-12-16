package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* compiled from: InterruptibleTask.java */
@InterfaceC37531b0
@ReflectionSupport(ReflectionSupport.Level.FULL)
@XY0.b
/* loaded from: classes6.dex */
abstract class B0<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f360483b;

    /* renamed from: c, reason: collision with root package name */
    public static final Runnable f360484c;

    static {
        f360483b = new c();
        f360484c = new c();
    }

    public abstract void a(Throwable th2);

    public abstract void b(@T0 T t12);

    public final void c() {
        Runnable runnable = f360484c;
        Runnable runnable2 = f360483b;
        Runnable runnable3 = get();
        if (runnable3 instanceof Thread) {
            b bVar = new b(this, null);
            b.a(bVar, Thread.currentThread());
            if (compareAndSet(runnable3, bVar)) {
                try {
                    ((Thread) runnable3).interrupt();
                } finally {
                    if (getAndSet(runnable2) == runnable) {
                        LockSupport.unpark((Thread) runnable3);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    @T0
    public abstract T e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            boolean z13 = runnable instanceof b;
            Runnable runnable2 = f360484c;
            if (!z13 && runnable != runnable2) {
                break;
            }
            if (z13) {
                bVar = (b) runnable;
            }
            i12++;
            if (i12 <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z12 = Thread.interrupted() || z12;
                LockSupport.park(bVar);
            }
            runnable = get();
        }
        if (z12) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        T tE2 = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD2 = d();
            Runnable runnable = f360483b;
            if (!zD2) {
                try {
                    tE2 = e();
                } catch (Throwable th2) {
                    try {
                        V0.a(th2);
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            g(threadCurrentThread);
                        }
                        if (zD2) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            g(threadCurrentThread);
                        }
                        if (!zD2) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f360483b) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, ", ");
        sbZ.append(f());
        return sbZ.toString();
    }

    /* compiled from: InterruptibleTask.java */
    @XY0.e
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final B0<?> f360485b;

        public b() {
            throw null;
        }

        public b(B0 b02, a aVar) {
            this.f360485b = b02;
        }

        public static void a(b bVar, Thread thread) {
            bVar.setExclusiveOwnerThread(thread);
        }

        public final String toString() {
            return this.f360485b.toString();
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: InterruptibleTask.java */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }
}
