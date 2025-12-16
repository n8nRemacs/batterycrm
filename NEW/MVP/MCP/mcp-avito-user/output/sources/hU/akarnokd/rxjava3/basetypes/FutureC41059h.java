package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FuturePerhapsSubscriber.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class FutureC41059h<T> extends CountDownLatch implements org.reactivestreams.d<T>, Future<T>, org.reactivestreams.e {

    /* renamed from: b, reason: collision with root package name */
    public T f397715b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f397716c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f397717d;

    public FutureC41059h() {
        super(1);
        this.f397717d = new AtomicReference<>();
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this.f397717d, eVar)) {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
    }

    @Override // org.reactivestreams.d
    public final void e() {
        while (true) {
            AtomicReference<org.reactivestreams.e> atomicReference = this.f397717d;
            org.reactivestreams.e eVar = atomicReference.get();
            if (eVar == this || eVar == SubscriptionHelper.f404813b) {
                return;
            }
            while (!atomicReference.compareAndSet(eVar, this)) {
                if (atomicReference.get() != eVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f397716c;
        if (th2 == null) {
            return this.f397715b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return SubscriptionHelper.f404813b == this.f397717d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        s41.C47998a.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return;
     */
    @Override // org.reactivestreams.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.e> r0 = r3.f397717d
            java.lang.Object r1 = r0.get()
            org.reactivestreams.e r1 = (org.reactivestreams.e) r1
            if (r1 == r3) goto L22
            io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper.f404813b
            if (r1 != r2) goto Lf
            goto L22
        Lf:
            r3.f397716c = r4
        L11:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L1b
            r3.countDown()
            return
        L1b:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L11
            goto L0
        L22:
            s41.C47998a.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.akarnokd.rxjava3.basetypes.FutureC41059h.onError(java.lang.Throwable):void");
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        this.f397715b = t12;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            AtomicReference<org.reactivestreams.e> atomicReference = this.f397717d;
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
    public final T get(long j12, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j12, timeUnit)) {
            throw new TimeoutException();
        }
        if (!isCancelled()) {
            Throwable th2 = this.f397716c;
            if (th2 == null) {
                return this.f397715b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}
