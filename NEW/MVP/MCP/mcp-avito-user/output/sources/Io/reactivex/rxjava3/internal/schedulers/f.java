package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InstantPeriodicTask.java */
/* loaded from: classes8.dex */
final class f implements Callable<Void>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: g, reason: collision with root package name */
    public static final FutureTask<Void> f404706g = new FutureTask<>(io.reactivex.rxjava3.internal.functions.a.f401992b, null);

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f404707b;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f404710e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f404711f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<Future<?>> f404709d = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<Future<?>> f404708c = new AtomicReference<>();

    public f(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f404707b = runnable;
        this.f404710e = scheduledExecutorService;
    }

    public final void a(Future<?> future) {
        while (true) {
            AtomicReference<Future<?>> atomicReference = this.f404709d;
            Future<?> future2 = atomicReference.get();
            if (future2 == f404706g) {
                future.cancel(this.f404711f != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r1.cancel(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5.f404711f == java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = false;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void call() {
        /*
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r5.f404711f = r0
            r0 = 0
            java.lang.Runnable r1 = r5.f404707b     // Catch: java.lang.Throwable -> L3d
            r1.run()     // Catch: java.lang.Throwable -> L3d
            r5.f404711f = r0     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ScheduledExecutorService r1 = r5.f404710e     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r1 = r1.submit(r5)     // Catch: java.lang.Throwable -> L3d
        L14:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r2 = r5.f404708c     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.FutureTask<java.lang.Void> r4 = io.reactivex.rxjava3.internal.schedulers.f.f404706g     // Catch: java.lang.Throwable -> L3d
            if (r3 != r4) goto L2f
            java.lang.Thread r2 = r5.f404711f     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L3d
            goto L35
        L2f:
            boolean r4 = r2.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L36
        L35:
            return r0
        L36:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 == r3) goto L2f
            goto L14
        L3d:
            r1 = move-exception
            r5.f404711f = r0
            s41.C47998a.b(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.schedulers.f.call():java.lang.Object");
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f404709d;
        FutureTask<Void> futureTask = f404706g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f404711f != Thread.currentThread());
        }
        Future<?> andSet2 = this.f404708c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f404711f != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f404709d.get() == f404706g;
    }
}
