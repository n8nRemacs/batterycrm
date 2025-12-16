package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ko7 implements Callable, py4 {
    public static final FutureTask X = new FutureTask(pdf.c, null);
    public final AtomicReference a;
    public final ExecutorService d;
    public Thread o;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference b = new AtomicReference();

    /* JADX WARN: Multi-variable type inference failed */
    public ko7(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.a = (AtomicReference) runnable;
        this.d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == X) {
                future.cancel(this.o != Thread.currentThread());
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
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5.o == java.lang.Thread.currentThread()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Runnable, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r5.o = r0
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = r5.a     // Catch: java.lang.Throwable -> L3d
            r1.run()     // Catch: java.lang.Throwable -> L3d
            r5.o = r0     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.ExecutorService r1 = r5.d     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r1 = r1.submit(r5)     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.atomic.AtomicReference r2 = r5.b     // Catch: java.lang.Throwable -> L3d
        L16:
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.FutureTask r4 = defpackage.ko7.X     // Catch: java.lang.Throwable -> L3d
            if (r3 != r4) goto L2f
            java.lang.Thread r2 = r5.o     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L3d
            return r0
        L2f:
            boolean r4 = r2.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L36
            return r0
        L36:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 == r3) goto L2f
            goto L16
        L3d:
            r1 = move-exception
            r5.o = r0
            defpackage.t8j.a(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko7.call():java.lang.Object");
    }

    @Override // defpackage.py4
    public final void dispose() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = X;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.o != Thread.currentThread());
        }
        Future future2 = (Future) this.b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.o != Thread.currentThread());
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c.get() == X;
    }
}
