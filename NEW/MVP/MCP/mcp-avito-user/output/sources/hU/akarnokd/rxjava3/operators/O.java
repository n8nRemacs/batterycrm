package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableTimeoutLast.java */
/* loaded from: classes8.dex */
final class O<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableTimeoutLast.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 7744982114753543953L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397972d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397972d, eVar)) {
                this.f397972d = eVar;
                this.f419376b.K(this);
                new N(this, 0L);
                throw null;
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }
    }

    /* compiled from: FlowableTimeoutLast.java */
    public static final class b<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 7744982114753543953L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397973d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397973d, eVar)) {
                this.f397973d = eVar;
                this.f419376b.K(this);
                throw null;
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
