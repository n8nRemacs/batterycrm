package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FutureSubscriber.java */
/* loaded from: classes8.dex */
public final class k<T> extends CountDownLatch implements InterfaceC41782o<T>, Future<T>, org.reactivestreams.e {

    /* renamed from: b, reason: collision with root package name */
    public T f404784b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f404785c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f404786d;

    public k() {
        super(1);
        this.f404786d = new AtomicReference<>();
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        SubscriptionHelper.e(this.f404786d, eVar, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (this.f404784b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference<org.reactivestreams.e> atomicReference = this.f404786d;
        org.reactivestreams.e eVar = atomicReference.get();
        if (eVar == this || eVar == SubscriptionHelper.f404813b) {
            return;
        }
        while (!atomicReference.compareAndSet(eVar, this)) {
            if (atomicReference.get() != eVar) {
                return;
            }
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
        Throwable th2 = this.f404785c;
        if (th2 == null) {
            return this.f404784b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f404786d.get() == SubscriptionHelper.f404813b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        AtomicReference<org.reactivestreams.e> atomicReference;
        org.reactivestreams.e eVar;
        if (this.f404785c == null && (eVar = (atomicReference = this.f404786d).get()) != this && eVar != SubscriptionHelper.f404813b) {
            while (!atomicReference.compareAndSet(eVar, this)) {
                if (atomicReference.get() != eVar) {
                }
            }
            this.f404785c = th2;
            countDown();
            return;
        }
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (this.f404784b == null) {
            this.f404784b = t12;
        } else {
            this.f404786d.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            AtomicReference<org.reactivestreams.e> atomicReference = this.f404786d;
            org.reactivestreams.e eVar = atomicReference.get();
            if (eVar == this || eVar == (subscriptionHelper = SubscriptionHelper.f404813b)) {
                return false;
            }
            while (!atomicReference.compareAndSet(eVar, subscriptionHelper)) {
                if (atomicReference.get() != eVar) {
                    break;
                }
            }
            if (eVar != null) {
                eVar.cancel();
            }
            countDown();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final T get(long j12, @j41.e TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j12, timeUnit)) {
            throw new TimeoutException(io.reactivex.rxjava3.internal.util.h.e(j12, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th2 = this.f404785c;
            if (th2 == null) {
                return this.f404784b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}
