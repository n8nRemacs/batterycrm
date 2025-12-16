package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FutureMultiObserver.java */
/* loaded from: classes8.dex */
public final class u<T> extends CountDownLatch implements io.reactivex.rxjava3.core.t<T>, L<T>, InterfaceC41771d, Future<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public T f402125b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f402126c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402127d;

    public u() {
        super(1);
        this.f402127d = new AtomicReference<>();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this.f402127d, dVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402127d;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            if (dVar == this || dVar == (disposableHelper = DisposableHelper.f401986b)) {
                return false;
            }
            while (!atomicReference.compareAndSet(dVar, disposableHelper)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            if (dVar != null) {
                dVar.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402127d;
        io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
        if (dVar == DisposableHelper.f401986b) {
            return;
        }
        while (!atomicReference.compareAndSet(dVar, this) && atomicReference.get() == dVar) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f402126c;
        if (th2 == null) {
            return this.f402125b;
        }
        throw new ExecutionException(th2);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return DisposableHelper.b(this.f402127d.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(Throwable th2) {
        while (true) {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402127d;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            if (dVar == DisposableHelper.f401986b) {
                C47998a.b(th2);
                return;
            }
            this.f402126c = th2;
            while (!atomicReference.compareAndSet(dVar, this)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(T t12) {
        AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402127d;
        io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
        if (dVar == DisposableHelper.f401986b) {
            return;
        }
        this.f402125b = t12;
        while (!atomicReference.compareAndSet(dVar, this) && atomicReference.get() == dVar) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j12, @j41.e TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j12, timeUnit)) {
            throw new TimeoutException(io.reactivex.rxjava3.internal.util.h.e(j12, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th2 = this.f402126c;
            if (th2 == null) {
                return this.f402125b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
    }
}
