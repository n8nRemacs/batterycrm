package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsRetryWhen.java */
/* loaded from: classes8.dex */
final class X0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsRetryWhen.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -1726278593241855499L;

        /* compiled from: PerhapsRetryWhen.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.X0$a$a, reason: collision with other inner class name */
        public final class C11296a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -790600520757208416L;

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this, null, eVar);
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
            public final void onNext(Object obj) {
                throw null;
            }
        }

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.d(null, eVar);
            throw null;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new io.reactivex.rxjava3.processors.e().z();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
