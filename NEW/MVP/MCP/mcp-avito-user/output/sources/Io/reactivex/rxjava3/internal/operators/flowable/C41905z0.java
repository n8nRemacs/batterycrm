package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableInterval.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41905z0 extends AbstractC41777j<Long> {

    /* compiled from: FlowableInterval.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z0$a */
    public static final class a extends AtomicLong implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403117b;

        /* renamed from: c, reason: collision with root package name */
        public long f403118c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403119d = new AtomicReference<>();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403117b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            DisposableHelper.a(this.f403119d);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f403119d;
            if (atomicReference.get() != DisposableHelper.f401986b) {
                long j12 = get();
                InterfaceC41782o interfaceC41782o = this.f403117b;
                if (j12 == 0) {
                    interfaceC41782o.onError(new MissingBackpressureException(AK.c.j(this.f403118c, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.a(atomicReference);
                } else {
                    long j13 = this.f403118c;
                    this.f403118c = j13 + 1;
                    interfaceC41782o.onNext(Long.valueOf(j13));
                    io.reactivex.rxjava3.internal.util.c.e(this, 1L);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
