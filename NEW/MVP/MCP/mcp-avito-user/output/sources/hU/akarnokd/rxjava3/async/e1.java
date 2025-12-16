package hu.akarnokd.rxjava3.async;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FutureCompletable.java */
/* loaded from: classes8.dex */
final class e1<T> extends CountDownLatch implements Future<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f397514b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationException f397515c;

    public e1() {
        super(1);
        this.f397514b = new AtomicInteger();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        if (!this.f397514b.compareAndSet(0, 3)) {
            return false;
        }
        this.f397515c = new CancellationException();
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        CancellationException cancellationException = this.f397515c;
        if (cancellationException == null) {
            return null;
        }
        throw new ExecutionException(cancellationException);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f397514b.get() == 3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j12, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j12, timeUnit)) {
            throw new TimeoutException();
        }
        CancellationException cancellationException = this.f397515c;
        if (cancellationException == null) {
            return null;
        }
        throw new ExecutionException(cancellationException);
    }
}
