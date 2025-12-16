package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapPublisher.java */
/* loaded from: classes8.dex */
public final class F<T, R> extends AbstractC41777j<R> {

    /* compiled from: SingleFlatMapPublisher.java */
    public static final class a<S, T> extends AtomicLong implements io.reactivex.rxjava3.core.L<S>, InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7759721921468635667L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404500b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f404501c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404502d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f404500b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f404501c, this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404502d = dVar;
            this.f404500b.K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404502d.dispose();
            SubscriptionHelper.a(this.f404501c);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f404500b.e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404500b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404500b.onNext(t12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(S s5) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404500b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f404501c, this, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
