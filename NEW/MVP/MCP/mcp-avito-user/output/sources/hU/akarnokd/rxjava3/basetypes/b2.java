package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: SoloToObservable.java */
/* loaded from: classes8.dex */
final class b2<T> extends io.reactivex.rxjava3.core.z<T> {

    /* compiled from: SoloToObservable.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.n<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 3162354714056564295L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397684d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397684d, eVar)) {
                this.f397684d = eVar;
                this.f402118b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397684d.cancel();
            super.dispose();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            a(this.f402119c);
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402118b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402119c = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        new a(g12);
        throw null;
    }
}
