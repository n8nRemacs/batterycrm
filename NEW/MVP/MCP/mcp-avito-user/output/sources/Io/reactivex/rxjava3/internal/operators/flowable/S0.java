package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableOnBackpressureError.java */
/* loaded from: classes8.dex */
public final class S0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnBackpressureError.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402542b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402543c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402544d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402542b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402543c, eVar)) {
                this.f402543c = eVar;
                this.f402542b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402543c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402544d) {
                return;
            }
            this.f402544d = true;
            this.f402542b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402544d) {
                C47998a.b(th2);
            } else {
                this.f402544d = true;
                this.f402542b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402544d) {
                return;
            }
            if (get() != 0) {
                this.f402542b.onNext(t12);
                io.reactivex.rxjava3.internal.util.c.e(this, 1L);
            } else {
                this.f402543c.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }
    }

    public S0(C41876p0 c41876p0) {
        super(c41876p0);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
