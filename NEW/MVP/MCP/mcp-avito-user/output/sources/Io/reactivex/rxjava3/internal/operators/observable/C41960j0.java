package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: ObservableFromPublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41960j0<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41777j f404102b;

    /* compiled from: ObservableFromPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.j0$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404103b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f404104c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404103b = g12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404104c, eVar)) {
                this.f404104c = eVar;
                this.f404103b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404104c.cancel();
            this.f404104c = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f404103b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404104c == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f404103b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404103b.onNext(t12);
        }
    }

    public C41960j0(AbstractC41777j abstractC41777j) {
        this.f404102b = abstractC41777j;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f404102b.d(new a(g12));
    }
}
