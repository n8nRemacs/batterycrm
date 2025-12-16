package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableTimer.java */
/* loaded from: classes8.dex */
public final class V1 extends AbstractC41777j<Long> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402565c;

    /* renamed from: d, reason: collision with root package name */
    public final long f402566d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f402567e;

    /* compiled from: FlowableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402568b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402569c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402568b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            DisposableHelper.a(this);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                this.f402569c = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.f401986b) {
                boolean z12 = this.f402569c;
                EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
                if (!z12) {
                    lazySet(emptyDisposable);
                    this.f402568b.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f402568b.onNext(0L);
                    lazySet(emptyDisposable);
                    this.f402568b.e();
                }
            }
        }
    }

    public V1(long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f402566d = j12;
        this.f402567e = timeUnit;
        this.f402565c = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        io.reactivex.rxjava3.disposables.d dVarE = this.f402565c.e(aVar, this.f402566d, this.f402567e);
        while (!aVar.compareAndSet(null, dVarE)) {
            if (aVar.get() != null) {
                if (aVar.get() == DisposableHelper.f401986b) {
                    dVarE.dispose();
                    return;
                }
                return;
            }
        }
    }
}
