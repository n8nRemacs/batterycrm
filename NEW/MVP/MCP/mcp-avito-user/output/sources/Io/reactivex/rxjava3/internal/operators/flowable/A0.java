package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableIntervalRange.java */
/* loaded from: classes8.dex */
public final class A0 extends AbstractC41777j<Long> {

    /* compiled from: FlowableIntervalRange.java */
    public static final class a extends AtomicLong implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402273b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402275d = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        public long f402274c = 0;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402273b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            DisposableHelper.a(this.f402275d);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402275d;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar != disposableHelper) {
                long j12 = get();
                InterfaceC41782o interfaceC41782o = this.f402273b;
                if (j12 == 0) {
                    interfaceC41782o.onError(new MissingBackpressureException(AK.c.j(this.f402274c, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.a(atomicReference);
                    return;
                }
                long j13 = this.f402274c;
                interfaceC41782o.onNext(Long.valueOf(j13));
                if (j13 == 0) {
                    if (atomicReference.get() != disposableHelper) {
                        interfaceC41782o.e();
                    }
                    DisposableHelper.a(atomicReference);
                } else {
                    this.f402274c = j13 + 1;
                    if (j12 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
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
