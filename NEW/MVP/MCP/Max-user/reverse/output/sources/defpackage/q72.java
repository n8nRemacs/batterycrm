package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class q72 extends sn6 implements Runnable {
    public ha8 X;
    public volatile ha8 Y;
    public yu c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch o = new CountDownLatch(1);

    public q72(yu yuVar, ha8 ha8Var) {
        this.c = yuVar;
        ha8Var.getClass();
        this.X = ha8Var;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.sn6, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ha8 ha8Var = this.X;
        if (ha8Var != null) {
            ha8Var.cancel(z);
        }
        ha8 ha8Var2 = this.Y;
        if (ha8Var2 != null) {
            ha8Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.sn6, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            ha8 ha8Var = this.X;
            if (ha8Var != null) {
                ha8Var.get();
            }
            this.o.await();
            ha8 ha8Var2 = this.Y;
            if (ha8Var2 != null) {
                ha8Var2.get();
            }
        }
        return this.a.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ha8, yu] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ha8, yu] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ha8, yu] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ha8 ha8VarApply = this.c.apply(wsf.e(this.X));
                            this.Y = ha8VarApply;
                            if (this.a.isCancelled()) {
                                ha8VarApply.cancel(((Boolean) b(this.d)).booleanValue());
                                this.Y = null;
                            } else {
                                ha8VarApply.d(new zn6(this, ha8VarApply, false, 5), ayi.a());
                            }
                        } catch (Exception e) {
                            tu1 tu1Var = this.b;
                            r0 = r02;
                            if (tu1Var != null) {
                                tu1Var.d(e);
                                r0 = r02;
                            }
                        }
                    } catch (Error e2) {
                        tu1 tu1Var2 = this.b;
                        r0 = r02;
                        if (tu1Var2 != null) {
                            tu1Var2.d(e2);
                            r0 = r02;
                        }
                    }
                } finally {
                    this.c = r02;
                    this.X = r02;
                    this.o.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                tu1 tu1Var3 = this.b;
                if (tu1Var3 != null) {
                    tu1Var3.d(cause);
                }
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            tu1 tu1Var4 = this.b;
            r0 = r02;
            if (tu1Var4 != null) {
                tu1Var4.d(cause2);
                r0 = r02;
            }
        }
    }

    @Override // defpackage.sn6, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ha8 ha8Var = this.X;
            if (ha8Var != null) {
                long jNanoTime = System.nanoTime();
                ha8Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.o.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ha8 ha8Var2 = this.Y;
                if (ha8Var2 != null) {
                    ha8Var2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
