package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapPublisher.java */
/* loaded from: classes8.dex */
public final class r<T, R> extends AbstractC41777j<R> {

    /* compiled from: MaybeFlatMapPublisher.java */
    public static final class a<T, R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<R>, io.reactivex.rxjava3.core.t<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403425b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403426c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f403427d = new AtomicLong();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403425b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this, this.f403427d, eVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403426c, dVar)) {
                this.f403426c = dVar;
                this.f403425b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403426c.dispose();
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403425b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403425b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(R r12) {
            this.f403425b.onNext(r12);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403425b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, this.f403427d, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
