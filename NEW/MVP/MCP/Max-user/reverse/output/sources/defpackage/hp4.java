package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hp4 extends AbstractExecutorService implements vee {
    public static final /* synthetic */ int Z = 0;
    public final AtomicInteger X;
    public final AtomicInteger Y;
    public final String a;
    public final Executor b;
    public volatile int c;
    public final LinkedBlockingQueue d;
    public final ue o;

    public hp4(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = "SerialExecutor";
        this.b = executor;
        this.c = 1;
        this.d = linkedBlockingQueue;
        this.o = new ue(9, this);
        this.X = new AtomicInteger(0);
        this.Y = new AtomicInteger(0);
    }

    public final void a(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        boolean zOffer = linkedBlockingQueue.offer(runnable);
        String str = this.a;
        if (!zOffer) {
            StringBuilder sbO = ho7.o(str, " queue is full, size=");
            sbO.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(sbO.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.Y;
        int i = atomicInteger.get();
        if (size > i && atomicInteger.compareAndSet(i, size)) {
            op5.e(hp4.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        b();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i = this.X.get();
        while (i < this.c) {
            int i2 = i + 1;
            if (this.X.compareAndSet(i, i2)) {
                op5.f(hp4.class, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.o);
                return;
            } else {
                op5.d(hp4.class, this.a, "%s: race in startWorkerIfNeeded; retrying");
                i = this.X.get();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        a(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
