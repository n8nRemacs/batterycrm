package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsAndThenNono.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41078n0<T> extends AbstractC41069k0<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }

    /* compiled from: PerhapsAndThenNono.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.n0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -7603167128015174475L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11308a f397732d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397733e;

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397732d = new C11308a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397733e, eVar)) {
                this.f397733e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397733e.cancel();
            SubscriptionHelper.a(this.f397732d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }

        /* compiled from: PerhapsAndThenNono.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.n0$a$a, reason: collision with other inner class name */
        public final class C11308a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -2562437629991690939L;

            public C11308a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.f(this, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                T t12 = aVar.f419377c;
                if (t12 != null) {
                    aVar.l(t12);
                } else {
                    aVar.f419376b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a.this.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
            }
        }
    }
}
